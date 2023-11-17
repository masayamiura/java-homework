public class ArgsLastPrinter {
    public static void main(String[]args) {
            if(args.length == 0){
            System.out.println("なし");
        }
            else{
            System.out.println("最後の引数は" + args[args.length - 1] + "です。");
        }
    }
}