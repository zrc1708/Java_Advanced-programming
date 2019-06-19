public class 分割字符串2 {
    public static void main(String[] args) {
        String str = "d:\\github\\zmx-nico\\zhumingxiong\\t1.md";


        System.out.println(str);
        String newstr=str.replace("\\","@");
        System.out.println(newstr);

        String[] array=newstr.split("@");

        System.out.println(array[array.length-1]);

        String nico = "t1.md";

      if (array[array.length-1].equals(nico)){
        System.out.println("ok");
      }else{
          System.out.println("no");
      }

        if(array[array.length-1].indexOf("t1")!=-1){
            System.out.println("存在");
        }else{
            System.out.println("不存在!");
        }
    }
}
