/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author danie
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream	is	=	new	FileInputStream("D:/NetBeansProjects/JavaIO/src/main/java/Principal/teste.txt");
        InputStreamReader	isr	=	new	InputStreamReader(is);
	BufferedReader	br	=	new	BufferedReader(isr);
	String	s	=	br.readLine();	//	primeira	linha
	//while	(s	!=	null)	{
            System.out.println(s);
            s=br.readLine();
        //}
        br.close();
        
        //teste com entrada do teclado
        is	=	System.in;
        isr	=	new	InputStreamReader(is);
        br	=	new	BufferedReader(isr);
        s	=	br.readLine();
        //while	(s	!=	" ")	{
            System.out.println(s);
            s	=	br.readLine();
            new TestaSaida(s);
        //}
        System.out.println(br.readLine());
        br.close();

    }
    
}
