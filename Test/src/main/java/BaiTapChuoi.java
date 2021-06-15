public class BaiTapChuoi {
    static String str = "You Only Live Once. But if You do it right. once is Enough";
    static void demInhoa(){
        int count = 0;
        for (int i=0; i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                count++;
        }
        System.out.println("Số từ viết in hoa trong chuỗi: "+count);
    }
    static void vietInhoa(){
        String[] arr = str.split(" ");
        String str1= "";
        for (String x : arr){
            str1 = str1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
            str1 = str1 + " ";
        }
        System.out.println("Chuỗi sau khi viết hoa chữ cái đầu các từ: "+str1);
            }
    static void convertString() {
        str = str.toLowerCase();
        boolean needtoUpperCase = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            if (needtoUpperCase) {
                char temp = Character.toUpperCase(str.charAt(i));
                str = str.substring(0, i) + temp + str.substring(i+1);
                needtoUpperCase = false;
            }
            if (str.charAt(i) == '.') needtoUpperCase = true;
        }
        System.out.println("Chuỗi sau khi đổi: \n" + str);
    }
}
