public class Array {
    public static void main(String[] args) {
        //if you know the size sith value
        int num[] = {3,8,6,6};
        for(int i = 0; i<4;i++){
            System.out.println(num[i]);
        }
        for(int p:num){
            System.out.print(p+",");
        }
        System.out.println();
        //if you dont know the value
        int num1[] = new int[4];
        num1[0]= 6;
        num1[1]= 5;
        num1[2]= 3;
        num1[3]= 4;
        for(int i = 0;i<4;i++){
            System.out.println(num1[i]);
        }
        // 2D Array
        int a[][] = new int[3][4];
        
        for(int i=0; i<3;i++){
            for(int j=0; j<4;j++){
                a[i][j]=(int) (Math.random()*100);//for double digit multiply by 100 /for single multi by 10
                System.out.print(a[i][j]+" ");   
            }
           System.out.println();
            }
            System.out.println("hello");
            //Jagged Array:Array that does not have value and size of that
            int arr[][]= new int[3][];
            // size specifying
            arr[0] = new int[3];
            arr[1] = new int[5];
            arr[2] = new int[2]; 
            for(int i =0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j]=(int) (Math.random()*10);
                }
                }
                for(int[] l : arr){
                    for(int m:l){
                        System.out.print(m+" ");
                    }
                    System.out.println();
            }
            // Student stud = new Student();
            // stud.name = "Hsuain";
            // System.out.println(stud.name);
            // System.out.println(stud.id=3);
            // System.out.println(stud.name="hashar");
            // Student st = new Student();
            // System.out.println(st.name="Mahesh");
            // System.out.println(st.id=4);
           Student s1= new Student();
            s1.rollNo = 1;
            s1.name = "Mahesh";
            s1.mark = 80;
            Student s2 = new Student();
            s2.rollNo = 2;
            s2.name = "amir";
            s2.mark = 70;
        Student students[] = new Student[2];
        students[0]=s1;
        students[1]=s2;
        //System.out.println(s1.rollNo+":"+ s1.name +":"+s1.mark);
        for(int i=0; i<students.length;i++){
            System.out.println(students[i].rollNo+" : "+students[i].name +" : "+students[i].mark);
        }
        


        };
    }
// Array of Object
class Student{
    int rollNo;
    String name;
    int mark;
}

