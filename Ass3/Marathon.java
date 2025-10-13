package Ass3;

class Marathon {

    public static void fastest_runner(String[] names, int[] times)
    {
        int min_time=times[0];
        String min_names=names[0];

        int second_min_time=times[0];
        String second_min_names=names[0];

        for (int i=0;i<times.length;i++)
        {
            if (times[i]<min_time)
            {
                min_time=times[i];
                min_names=names[i];
            }

            if (times[i]<second_min_time && times[i]>min_time)
            {
                second_min_time=times[i];
                second_min_names=names[i];
            }
        }

        System.out.println("The fastest runner is "+min_names+" with a time of "+min_time);
        System.out.println("The second fastest runner is "+second_min_names+" with a time of "+second_min_time);
    }
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        fastest_runner(names, times);
    }
} 