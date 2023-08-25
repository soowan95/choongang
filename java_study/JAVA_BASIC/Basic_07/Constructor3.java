class Par3 {
  String name;
  int age;
  Par3(String name, int age) {
    this.name = name;
    this.age = age;
  }
  String str() {
    return String.format("이름 : %s, 나이 : %d", name, age);
  }
}

public class Constructor3 {
  public static void main(String[] args) {
    Par3 par1 = new Par3("김수완", 29);
    Par3 par2 = new Par3("누구누구", 21);
    Par3 par3 = new Par3("아야어여", 31);
    Par3[] pars = {par1, par2, par3};
    for(int i = 0; i < pars.length; i++) {
      System.out.println(pars[i].str());
    }
  }
}
