import java.io.*;
class FileHandling1
{
	public static void main(String args[])throws Exception
	{   int ch;
	    int char_count=0,word_count=0,line_count=0;
        File f=new File("testfile.txt");
		FileReader fr=new FileReader(f);
        FileWriter fw=new FileWriter("copy.txt");

		while((ch=fr.read()) != -1)
		{
			 if(ch==' ')
				word_count++;
			else if(ch=='\n')
			{
				line_count++;
				word_count++;
			}
            System.out.print((char)ch);
			char_count++;
		}
        System.out.println("No of Characters: "+char_count);
		System.out.println("No of Words: "+(word_count+1));
		System.out.println("No of Lines: "+(line_count+1));
		fr.close();
		fw.close();
	}
}
