//¡¾Àý1.3¡¿  Êý×éµÄË³Ðò²éÕÒ¡£

public class ArraySeqSearch
{
    public static int[] random(int n)                      //²úÉún¸öËæ»úÊý£¬·µ»ØÕûÐÍÊý×é
    {
        if (n>0)
        {
            int table[] = new int[n];
            for (int i=0; i<table.length; i++)
                table[i] = (int)(Math.random()*100);       //²úÉúÒ»¸ö0¡«100Ö®¼äµÄËæ»úÊý
            return table;                                  //·µ»ØÒ»¸öÊý×é
        }
        return null;
    }

    public static void print(int[] table)                  //Êä³öÊý×éÔªËØ
    {
        if (table!=null)
            for (int i=0; i<table.length; i++)
                System.out.print(" "+table[i]);
        System.out.println();
    }

    public static int indexOf(int[] table, int value)      //ÔÚÕûÊýÊý×éÖÐ²éÕÒ¸ø¶¨Öµ
    {                                                      //Èô²éÕÒ³É¹¦·µ»ØÔªËØÏÂ±ê£¬·ñÔò·µ»Ø-1
        if (table!=null)
            for(int i=0; i<table.length; i++)
            {
                System.out.print(table[i]+"? ");
                if (table[i]==value)                       //»ù±¾Êý¾ÝÀàÐÍ²ÉÓÃ==¡¢!=ÔËËã·û½øÐÐ±È½Ï
                    return i;
            }
        return -1;
    }  

    public static int indexOf(Object[] table, Object obj)  //ÔÚ¶ÔÏóÊý×éÖÐ²éÕÒ¸ø¶¨Öµ
    {                                                      //Èô²éÕÒ³É¹¦·µ»ØÔªËØÏÂ±ê£¬·ñÔò·µ»Ø-1
        if (table!=null && obj!=null)
            for(int i=0; i<table.length; i++)
                if (obj.equals(table[i]))                  //¶ÔÏó²ÉÓÃequals()·½·¨±È½ÏÊÇ·ñÏàµÈ
                    return i;
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] table ={52,26,97,19,66,8,49};                //ÎÞÐò
        System.out.print("ÎÞÐòµÄ¹Ø¼ü×ÖÐòÁÐ: ");
        print(table);
        int key=19;
        System.out.println("Ë³Ðò²éÕÒ "+key+", "+((indexOf(table,key)==-1)?"²»":"")+"³É¹¦");
        key=25;
        System.out.println("Ë³Ðò²éÕÒ "+key+", "+((indexOf(table,key)==-1)?"²»":"")+"³É¹¦");
    }
}

/* 
³ÌÐòÔËÐÐ½á¹ûÈçÏÂ£º
ÎÞÐòµÄ¹Ø¼ü×ÖÐòÁÐ:  52 26 97 19 66 8 49
52? 26? 97? 19? Ë³Ðò²éÕÒ 19, ³É¹¦
52? 26? 97? 19? 66? 8? 49? Ë³Ðò²éÕÒ 25, ²»³É¹¦

*/
