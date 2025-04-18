package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열) , MultidimensionalArray

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        // 1차원 배열을 이용한 방법
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"}; // 한번에 영역을 선택하는 단축기 Option + 드래그
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][]{ // 2차원 배열 [][] 대괄호 2개, 차원이 늘어날수록 대괄고 1개씩 추가
                {"A1", "A2", "A3", "A4", "A5"}, // 1차원 배열 값들을 , 구분한 다음 {} 감싸는 형태
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2 에 접근 하려면?
        System.out.println(seats[1][1]);

        // C5 에 접근 하려면?
        System.out.println(seats[2][4]);

        System.out.println("-----------------------------------");

        // 첫 줄에는 3칸, 둘쨰 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3 에 접근 하려면?
        System.out.println(seats2[0][2]);
        
        // A5 에 접근 하려면?
        // System.out.println(seats2[0][4]); (index 값 오류)

        // 3차원 배열 만들기 (세로 x 가로 x 높이 직육면체 형태의 공간)
        String[][][] marray = new String[][][]{
                {{}, {}, {}},
                {{}, {}, {}},
                {{}, {}, {}},
        };
        String[][][] marray2 = new String[3][3][3];
    }
}
