package com.example.testgym;


public class LossExercises {

    private String name ;
    private String description ;
    private  int idImage;


    public  static final LossExercises [] loss = {
            new LossExercises( "Jogging" , " Do a warm-up exercise of your choice for a good 5 minutes without interruption.\n" +
                    "Take your first sprint (run) for 30 seconds, and do your best to go faster.\n" +
                    "After 30 seconds, slow down and start walking at a brisk pace for 120 seconds.\n" +
                    "Run again for the next 30 seconds at your maximum power.\n" +
                    "Slow down again and start walking for 120 seconds.\n" +
                    "Follow this pattern for the next 20 minutes without interruption" , R.drawable.jogging),

            new LossExercises("Cycling" , " The benefits of cycling for weight loss include boosting your metabolism and building muscle. Some people wonder how many calories a bicycle burns, and the truth is that cycling at a steady pace burns about 300 calories per hour.\n" +
                    "\n" +
                    "To maximize the benefits of cycling for fat burning and weight loss, it should be paired with a healthy and balanced diet.",R.drawable.cycle),

            new LossExercises( "Swimming", " In fact, swimming helps you lose weight because it burns calories vigorously, and the amount of weight loss depends on a person's weight, age, and how long they spend swimming. It should be noted that it takes about a month for swimming to show results in weight loss and improved coordination and flexibility.\n" +
                    "\n" +
                    "Vigorous swimming for an hour helps to lose 1.8 kilograms of weight if done 4 times a week for a month, and moderate swimming for 30 minutes helps to lose about half a kilogram if done 4 times a week for a month.",R.drawable.swim)

    };

    public LossExercises(String name, String description, int idImage) {
        this.name = name;
        this.description = description;
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    @Override
    public String toString() {
        return "LossExercises{" +
                "name='" + name + '\'' +
                '}';
    }
}
