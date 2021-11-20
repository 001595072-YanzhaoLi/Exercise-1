/**
 * full time student
 *
 * @author Yanzhao Li
 * @date 2021/10/23
 */
public class FullTime extends Student {

    private short exam1;
    private short exam2;

    /**
     * full time student info
     *
     * @param exam1  exam1
     * @param exam2  exam2
     * @param name   name
     * @param quiz1  quiz1
     * @param quiz2  quiz2
     * @param quiz3  quiz3
     * @param quiz4  quiz4
     * @param quiz5  quiz5
     * @param quiz6  quiz6
     * @param quiz7  quiz7
     * @param quiz8  quiz8
     * @param quiz9  quiz9
     * @param quiz10 quiz10
     * @param quiz11 quiz11
     * @param quiz12 quiz12
     * @param quiz13 quiz13
     * @param quiz14 quiz14
     * @param quiz15 quiz15
     */
    public FullTime(String name, short quiz1, short quiz2, short quiz3, short quiz4, short quiz5, short quiz6, short quiz7, short quiz8, short quiz9, short quiz10,
                    short quiz11, short quiz12, short quiz13, short quiz14, short quiz15, short exam1, short exam2) {
        super(name,quiz1,quiz2,quiz3,quiz4,quiz5,quiz6,quiz7,quiz8,quiz9,quiz10,quiz11,quiz12,quiz13,quiz14,quiz15);
        this.exam1 = exam1;
        this.exam2 = exam2;
    }






    /**
     * return exam grade with name
     *
     * @return {@link String}
     */
    public String getExam() {
        return "{" +
                "name='" + name + '\'' +
                ", exam1=" + exam1 +
                ", exam2=" + exam2 +
                '}';
    }

    /**
     * toString
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        return "FullTime{" +
                "name='" + name + '\'' +
                ", quiz1=" + quiz1 +
                ", quiz2=" + quiz2 +
                ", quiz3=" + quiz3 +
                ", quiz4=" + quiz4 +
                ", quiz5=" + quiz5 +
                ", quiz6=" + quiz6 +
                ", quiz7=" + quiz7 +
                ", quiz8=" + quiz8 +
                ", quiz9=" + quiz9 +
                ", quiz10=" + quiz10 +
                ", quiz11=" + quiz11 +
                ", quiz12=" + quiz12 +
                ", quiz13=" + quiz13 +
                ", quiz14=" + quiz14 +
                ", quiz15=" + quiz15 +
                ", exam1=" + exam1 +
                ", exam2=" + exam2 +
                '}';
    }
}
