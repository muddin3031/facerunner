

public class FaceRunner {
    public static void main(String[] args)
    {
        String[][] face = new String[6][5];
        FaceDrawing face1 = new FaceDrawing(face);

        face1.fill("x");
        face1.edit("0",1,0);
        face1.edit("0",0,1);
        face1.edit("0",1,2);
        face1.edit("0",0,3);
        face1.edit("0",1,4);
        face1.edit("0",2,1);
        face1.edit("0",2,3);
        face1.edit("0",3,2);
        face1.edit("v",4,0);
        face1.edit("v",5,1);
        face1.edit("v",5,2);
        face1.edit("v",5,3);
        face1.edit("v",4,4);
        face1.edit("-",0,2);
        face1.edit("-",1,1);
        face1.edit("-",1,3);
        face1.edit("-",2,2);
        face1.edit(" ",4,1);
        face1.edit(" ",4,2);
        face1.edit(" ",4,3);
        face1.edit(" ",5,0);
        face1.edit(" ",5,4);

        System.out.println(face1);


    }
}

