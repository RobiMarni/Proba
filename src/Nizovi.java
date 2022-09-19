import java.util.Arrays;

public class Nizovi {

    public static void main(String[] args) {


        int[] lottoTicket = new int[6];
        lottoTicket[0] = 6;
        lottoTicket[1] = 7;
        lottoTicket[2] = 8;
        lottoTicket[3] = 55;
        lottoTicket[4] = 28;
        lottoTicket[5] = 43;
        // System.out.println(lottoTicket[1]);

        for (int i = 0; i < lottoTicket.length; i++) {
            System.out.println(lottoTicket[i]);
        }

        for (int lt : lottoTicket)
            System.out.println(lt);

        System.out.println(Arrays.toString(lottoTicket));


        Arrays.sort(lottoTicket);
        System.out.println(Arrays.toString(lottoTicket));

        int[] newArray = {100, 500, 30, 45, 120, 10};



        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] >= 100) {
                System.out.println("Veci ili jednak:" + newArray[i]);
            } else {
                System.out.println("Manji " + newArray[i]);
            }
        }


    }


}

