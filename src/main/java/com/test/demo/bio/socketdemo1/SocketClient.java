package com.test.demo.bio.socketdemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端
 */
public class SocketClient {

    public  static void main(String[] args){

        try {
            Socket client = new Socket("127.0.0.1",9999);
            PrintWriter pw = new PrintWriter(client.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            pw.write(br.readLine());
            pw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
