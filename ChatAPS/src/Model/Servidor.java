package Model;

import View.ConexaoServidor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sun.misc.IOUtils;

public class Servidor extends Thread {

    public static ArrayList<BufferedWriter> clientes;
    public static ArrayList<String> clientesS = new ArrayList<String>();
    private static ServerSocket server;
    private String nome;
    private Socket con;
    private InputStream in;
    private InputStreamReader inr;
    private BufferedReader bfr;
    private OutputStream ou;
    private Writer ouw;
    private BufferedWriter bfw;

    /**
     * Método construtor
     *
     * @param com do tipo Socket
     */
    public Servidor(Socket con) {
        this.con = con;
        try {
            in = con.getInputStream();
            inr = new InputStreamReader(in);
            bfr = new BufferedReader(inr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método run
     */
    public void run() {

        try {

            String msg;
            ou = this.con.getOutputStream();
            ouw = new OutputStreamWriter(ou);
            bfw = new BufferedWriter(ouw);
            clientes.add(bfw);
            nome = msg = bfr.readLine();
            clientesS.add(nome);
            
            while (!"Sair".equalsIgnoreCase(msg) && msg != null) {
                msg = bfr.readLine();
                sendToAll(bfw, msg);
                System.out.println(msg);

            }
            
            

        } catch (IOException e) {
            System.out.println(nome + " Saiu");
            clientes.remove(bfw);
            arrayNow();

        }
    }

    private void arrayNow() {
        for (int i = 0; i <= clientesS.size(); i++) {
            if (nome.equals(clientesS.get(i))) {
                clientesS.remove(i);
                break;
            }
        }
    }

    public void fecharServer() {
        try {
            server.close();
            con.shutdownInput();
            con.shutdownOutput();
            in.close();
            inr.close();
            bfr.close();
            con.close();
            ouw.close();
            clientes.clear();
            bfw.close();
            clientesS.clear();
            JOptionPane.showMessageDialog(null, "Servidor fechado!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar o server!");
        }

    }

    /**
     * *
     * Método usado para enviar mensagem para todos os clients
     *
     * @param bwSaida do tipo BufferedWriter
     * @param msg do tipo String
     * @throws IOException
     */
    public void sendToAll(BufferedWriter bwSaida, String msg) throws IOException {
        BufferedWriter bwS;

        for (BufferedWriter bw : clientes) {
            bwS = (BufferedWriter) bw;
            if (!(bwSaida == bwS)) {
                bw.write(nome + " disse -> " + msg + "\r\n");
                bw.flush();
            }
        }
    }

} //Fim da classe

