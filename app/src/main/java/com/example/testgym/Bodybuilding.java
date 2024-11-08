package com.example.testgym;


public class Bodybuilding {
    private String name;
    private String description;
    private int idImage;

    public static final Bodybuilding[] body = {
            new Bodybuilding("Chest Exercise",
                    "The basics in the flat bar chest exercise are that the hands on the bar should be opened at 90 degrees and that the position of the grip should be memorized because each person has a different grip position on the bar. "
                            + "When lying on the bench, keep your shoulders back and your chest forward, with your back arched as shown in the picture. "
                            + "When the bar is lowered, it is on the campaign area in the chest or directly above it.",
                    R.drawable.excchest),

            new Bodybuilding("Foot Exercises",
                    "Lie on your back with your feet flat on the floor. "
                            + "Bend your knees at a ninety-degree angle and start lifting your legs together in parallel. "
                            + "As you lift your feet make sure to tighten your abdominal muscles. "
                            + "Lift your feet up as if they're reaching the ceiling. Hold this position for three seconds. "
                            + "Lower your legs gradually and slowly. Relax for a moment then repeat the exercise again and do ten repetitions. "
                            + "The exercise may be difficult at first but it should not cause pain in the thigh or knee. "
                            + "If you feel pain, stop doing the exercise and consult your doctor as soon as possible.",
                    R.drawable.leg),

            new Bodybuilding("Back Exercises",
                    "Lie on your back with knees bent, feet flat on the floor. Using both hands, pull one knee pressing it toward your chest. "
                            + "Tighten your abdominal muscles and press your spine toward the floor for 5 seconds. "
                            + "Return to the starting position, repeat the exercise with your other foot, then repeat 2 to 3 times throughout the day.",
                    R.drawable.back)
    };

    private Bodybuilding(String name, String description, int idImage) {
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
        return "Bodybuilding{" +
                "name='" + name + '\'' +
                '}';
    }
}
