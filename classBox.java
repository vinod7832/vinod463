class BoxProgram{
    int length;
    int height;
    int width;
    // BoxDetails(){
    //     length=20;
    //     height=10;
    //     width=25;
        
    //}
 public void ReadBox(){
    length=20;
    height=30;
    width=40;
 }
 public void CalculateArea(){
    System.out.println("Volume: "+length*height*width);
}
}



public class classBox {
    public static void main(String[] args)
    {
        BoxProgram box[]=new BoxProgram[5];
        //box.length=10;
        //box.height=20;
        //box.width=30;
        //box.CalculateArea();
        for(int i=0;i<box.length;i++)
        {
            //box[i]=new BoxProgram();
            box[i].ReadBox();
            //box[i].CalculateArea();
        }
        for(int i=0;i<box.length;i++)
        {
            box[i].CalculateArea();
        }

        //System.out.println("Volume: "+box.length*box.height*box.width);
        //System.out.println(box.BoxProgram());
        //System.out.println("length: "+box.length+" height: "+box.height+" width: "+box.width);
    }
    
}
