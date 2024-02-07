package ru.inno.lessons.lesson9;

import java.util.*;

//Проверьте пожалуйста это задание на соответствие условию
//Как по мне условие очень криво написано и реализацию костылять надо.
//Например: Выведите на экран 3х лучших игроков турнира. Вывести просто сделать sout из того что мы знаем кому мы записали очки? или нужно с сротировкой работать, как я сдеал?
//Как записать очки игроку с id = 4? если мы не проходили ентри сет, а ключ к мапе это и есть player, тоже вопрос.(я сделал заранее лист players, без него без понятия, как выполнить задание)
public class Task6 {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        players.add(new Player(1, "player1", true));
        players.add(new Player(2, "player2", true));
        players.add(new Player(3, "player3", true));
        players.add(new Player(4, "player4", true));
        players.add(new Player(5, "player5", true));
        players.add(new Player(6, "player6", true));
        players.add(new Player(7, "player7", true));
        players.add(new Player(8, "player8", true));
        players.add(new Player(9, "player9", true));
        players.add(new Player(10, "player10", true));

        Map<Player, Integer> points = new HashMap<>();

        for (Player player : players) {
            points.put(player, 0);
        }

        for (Player player : players) {
            switch (player.getId()) {
                case (4):
                    points.put(player, 10);
                    break;
                case (7):
                    points.put(player, 12);
                    break;
                case (8):
                    points.put(player, 11);
                    break;
                case (9):
                    points.put(player, 13);
                    break;
                case (10):
                    points.put(player, 5);
                    break;
                default:
                    break;
            }
        }

        List<Integer> buff = new ArrayList<>(points.values().stream().toList());
        Collections.sort(buff, Comparator.reverseOrder());
        Map<Player, Integer> buffPlayers = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            for (Player player : players) {
                if (points.get(player) == buff.get(i)) {
                    System.out.println(player + " : " + buff.get(i));
                    buffPlayers.put(player, points.get(player));
                    points.remove(player);
                }
            }
        }
    }
}
