public class DoorGame {
    public static void main(String[] args) {

        //chooses one door and doesn't switch door
        double wins1 = 0.0;
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            int prize = (int) (Math.random()*3);
            int chosendoor = (int) (Math.random()*3);
            if (prize == chosendoor) wins1++;
        }
        
        System.out.println(Math.round((wins1/N)*100) + " percent of chance of success");

        //chooses one door and switches after

        double wins2 = 0.0;
        for (int i = 0; i < N; i++) {
            int prize = (int) (Math.random()*3)+1;
            int chosendoor = (int) (Math.random()*3)+1;
            
        //switch in three different cases

        switch(chosendoor) {
            case 1: chosendoor = (int)(Math.random()*2)+2; break; //change to 2 or 3
            case 3: chosendoor = (int)(Math.random()*2)+1; break;//change to 1 or 2
            case 2:
                double play = Math.random();
                if (play >= 0.5) chosendoor = 1;
                else             chosendoor = 3;
                break;
        }

        if (chosendoor == prize) {wins2++;}
        }
        System.out.println(Math.round((wins2/N)*100) + " percent of chance of success");
    }
}

//int a = (int) (Math.random() * 3)+2; //2, 3 or 4
