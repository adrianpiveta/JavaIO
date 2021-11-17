/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.io.*;

/**
 *
 * @author danie
 */
public class TestaSaida	{

    public TestaSaida(String saida) throws FileNotFoundException, IOException {
        OutputStream	os	=	new	FileOutputStream("teste.txt");
        OutputStreamWriter	osw	=	new	OutputStreamWriter(os);
        BufferedWriter	bw	=	new	BufferedWriter(osw);
        bw.write(saida);
        bw.close();
    }
    
    /*
    public	static	void	main(String[]	args)	throws	IOException	{
        
    }
*/
}

