package self;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author superlfx@aliyun.com
 * @since 2021-05-04 11:08
 */
public class Study003 {
    /**
     * 你的面前有一堵矩形的、由n行砖块组成的砖墙。这些砖块高度相同（也就是一个单位高）但是宽度不同。每一行砖块的宽度之和应该相等。
     *
     * 你现在要画一条自顶向下的、穿过最少砖块的垂线。如果你画的线只是从砖块的边缘经过，就不算穿过这块砖。你不能沿着墙的两个垂直边缘之一画线，这样显然是没有穿过一块砖的。
     *
     * 给你一个二维数组wall，该数组包含这堵墙的相关信息。其中，wall[i]是一个代表从左至右每块砖的宽度的数组。你需要找出怎样画才能使这条线 穿过的砖块数量最少，并且返回穿过的砖块数量 。
     *
     * 输入：wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
     * 输出：2
     *
     * 输入：wall = [[1],[1],[1]]
     * 输出：3
     *
     */

    class solution{
        public int leastBricks(List<List<Integer>> wall) {
            //map中的key存储的是每块砖缝隙的位置，value是每个不同的
            //位置出现的次数
            Map<Integer, Integer> map = new HashMap();
            int maxGap = 0;//保存缝隙出现的最大值即可
            for (List<Integer> row : wall) {
                //每行缝隙的位置，也就当前行中每块砖右边的位置
                int gap = 0;
                //因为最后一块砖的右边是墙的边缘，根据题的要求不能沿
                //着这里画垂线，所以最后一块砖的位置就不要计算了
                for (int i = 0; i < row.size() - 1; i++) {
                    //计算当前砖右边的位置，也是当前砖右边缝隙的位置
                    gap += row.get(i);
                    //key是缝隙的位置，value是这个位置出现的次数
                    map.put(gap, map.getOrDefault(gap, 0) + 1);
                    //保存缝隙出现的最大值
                    maxGap = Math.max(maxGap, map.get(gap));
                }
            }
            //穿过砖的数量是墙的高度减去穿过缝隙的数量
            return wall.size() - maxGap;
        }
    }

}
