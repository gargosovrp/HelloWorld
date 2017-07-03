/**
 * Created by Gargo on 03.07.2017.
 */
public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne   = {"Товарищи!", "С другой стороны", "Равным образом", "Не следует, однако, забывать, что", "Таким образом", "Повседневная практика показывает, что"};
        String[] wordListTwo   = {"реализация намеченных плановых заданий", "рамки и место обучения кадров", "постоянный количественный рост и сфера нашей активности", "сложившаяся структура организации", "новая модель организационной деятельности", "дальнейшее развитие различных форм деятельности"};
        String[] wordListThree = {"играет важную  роль в формировании", "требуют от нас анализа", "требуют определения и уточнения", "способствует подготовке и реализации", "обеспечивает широкому кругу (специалистов) участие в формировании", "позволяет выполнить важные задания по разработке"};
        String[] wordListFour  = {"существенных финансовых и административных условий", "дальнейших направлений развития", "системы массового участия", "позиций, занимаемых участниками в отношении поставленных задач", "новых предложений", "направлений прогрессивного развития"};

        int oneLength   = wordListOne.length;
        int twoLength   = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength  = wordListFour.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour;

        System.out.println (" Всё, что нам нужно, - это " + phrase);
    }
}
