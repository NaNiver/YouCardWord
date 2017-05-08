import java.io.*;
public class Verb extends Word
{
    public String direccion;
    
    public Verb(String ID)
    {
        super.ID=ID;
        super.text = ID+"s";
        direccion="Texto.txt";
    }
   
    public String leerTxt(){ //direccion del archivo
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                if(bfRead!=null)
                 {
                     temp=bfRead;
                     System.out.println(temp);
                    }//guardado el texto del archivo
            }
            texto = temp;
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
            System.out.println("No se encontro archivo");
        }
        
        return texto;
        
    }
    
    public String  fusion(Word other)
    {
        String phrase=null;
        if(other.getClass()==Noun.class)
        {
            phrase=other.text+" "+text;
        }
        else
        {
            phrase=text;
        }
        return phrase;
    }
    
}
