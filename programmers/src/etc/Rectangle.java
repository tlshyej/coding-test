package etc;

public class Rectangle {

    /**
     * 나머지 한 점
     * https://school.programmers.co.kr/learn/courses/18/lessons/1878
     */
    public static int[] getCoordinate(int[][] values) {

        // ^ - XOR: 두 수가 같으면 0, 두 수가 다르면 1 (좌표 대칭값)
        int[] answer = new int[2];
        answer[0] = values[0][0] ^ values[1][0] ^ values[2][0];
        answer[1] = values[0][1] ^ values[1][1] ^ values[2][1];
        return answer;

        /*
        Map<String, Integer> map = new HashMap<>();

        for (int[] value : values) {
            for (int j = 0; j < value.length; j++) {
                int val = value[j];
                String key = "" + j + val;

                if (map.containsKey(key))
                    map.remove(key);
                else
                    map.put(key, val);
            }
        }

        int x = 0, y = 0;
        for (String key : map.keySet()) {
            if (key.startsWith("0")) x = map.get(key);
            else y = map.get(key);
        }

        return new int[] {x, y};
        */

    }

}
