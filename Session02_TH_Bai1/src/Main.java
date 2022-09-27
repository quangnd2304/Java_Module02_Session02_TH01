import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen n: ");
        int n = Integer.parseInt(sc.nextLine());
        int sum;
        boolean check;
        do {
            System.out.println("**********MENU*************");
            System.out.println("1. In ra cac so chan va tinh tong");
            System.out.println("2. In ra cac so le va tinh tong");
            System.out.println("3. Kiem tra so nguyen to");
            System.out.println("4. Kiem tra so hoan hao");
            System.out.println("5. In ra cac so nguyen to 0....n");
            System.out.println("6. In ra cac uoc so cua n va tinh tong");
            System.out.println("7. Thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    sum = 0;
                    //In ra cac so chan tu 1 den n
                    System.out.printf("Cac so chan trong khoang 1...%d la: \n",n);
                    for (int i = 1; i <=n ; i++) {
                        if (i%2 == 0) {
                            System.out.printf("%d\t",i);
                            sum+=i;
                        }
                    }
                    System.out.printf("\nTong cac so chan la: %d\n",sum);
                    break;
                case 2:
                    sum = 0;
                    //In ra cac so le tu 1 den n
                    System.out.printf("Cac so le trong khoang 1...%d la: \n",n);
                    for (int i = 1; i <=n ; i++) {
                        if (i%2!=0){
                            System.out.printf("%d\t",i);
                            sum+=i;
                        }
                    }
                    System.out.printf("\nTong cac so le la: %d\n",sum);
                    break;
                case 3:
                    if (n>=2) {
                        check = false;
                        //Tim cac uoc cua n tu 2....sqrt(n)
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                check = true;
                                break;
                            }
                        }
                        if (check) {
                            System.out.printf("%d khong phai la so nguyen to\n", n);
                        } else {
                            System.out.printf("%d la so nguyen to\n", n);
                        }
                    }else{
                        System.out.printf("%d khong phai la so nguyen to", n);
                    }
                    break;
                case 4:
                    sum = 0;
                    for (int i = 1; i <n ; i++) {
                        if (n%i == 0) {
                            //i la uoc so cua n
                            sum+=i;
                        }
                    }
                    if (sum==n){
                        System.out.printf("So %d la so hoan hao\n",n);
                    }else{
                        System.out.printf("So %d khong phai la so hoan hao\n",n);
                    }
                    break;
                case 5:
                    //Duyet cac so tu 2 den n
                    if (n>=2){
                        System.out.printf("Cac so nguyen to tu 0 den %d la: \n",n);
                        for (int i = 2; i <=n ; i++) {
                            //Kiem tra i co phai la so nguyen to hay khong?
                            check = false;
                            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                                if(i%j==0){
                                    //j la uoc cua i
                                    check = true;
                                    break;
                                }
                            }
                            if(!check){
                                //i la so nguyen to
                                System.out.printf("%d\t",i);
                            }
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 6:
                    sum = 0;
                    System.out.printf("Cac uoc so cua %d la: \n",n);
                    for (int i = 1; i <=n ; i++) {
                        if (n%i==0){
                            //i la uoc cua n
                            System.out.printf("%d\t",i);
                            sum+=i;
                        }
                    }
                    System.out.printf("\nTong cac uoc cua %d la: %d\n",n,sum);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-7");
            }
        }while(true);
    }
}