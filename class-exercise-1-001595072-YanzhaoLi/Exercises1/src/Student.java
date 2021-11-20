/**
 * student
 *
 * @author Yanzhao Li
 * @date 2021/10/23
 */
public class Student {
    protected short quiz1;
    protected short quiz2;
    protected short quiz3;
    protected short quiz4;
    protected short quiz5;
    protected short quiz6;
    protected short quiz7;
    protected short quiz8;
    protected short quiz9;
    protected short quiz10;
    protected short quiz11;
    protected short quiz12;
    protected short quiz13;
    protected short quiz14;
    protected short quiz15;
    protected String name;

    public Student(String name, short quiz1, short quiz2, short quiz3, short quiz4, short quiz5, short quiz6, short quiz7, short quiz8, short quiz9, short quiz10,
                   short quiz11, short quiz12, short quiz13, short quiz14, short quiz15) {
        this.name = name;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.quiz5 = quiz5;
        this.quiz6 = quiz6;
        this.quiz7 = quiz7;
        this.quiz8 = quiz8;
        this.quiz9 = quiz9;
        this.quiz10 = quiz10;
        this.quiz11 = quiz11;
        this.quiz12 = quiz12;
        this.quiz13 = quiz13;
        this.quiz14 = quiz14;
        this.quiz15 = quiz15;
    }

    /**
     * sum of all quiz grade
     *
     * @return int
     */
    public int sum() {
        return (quiz1 + quiz2 + quiz3 + quiz4 + quiz5 + quiz6 + quiz7 + quiz8 + quiz9 + quiz10 + quiz11 + quiz12 + quiz13 + quiz14 + quiz15);
    }
    /**
     * calculate all quiz grade average
     *
     * @return float
     */
    public float calculateAverage() {
        return sum() / 15;
    }

    /**
     * get student name
     *
     * @return {@link String}
     */
    public String getName() {
        return name;
    }
}
