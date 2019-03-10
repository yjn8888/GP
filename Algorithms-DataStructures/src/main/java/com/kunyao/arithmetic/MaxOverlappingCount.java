package com.kunyao.arithmetic;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

/**
 *  区间重叠最大个数算法
 *    N个区间，获取这些区间重叠的最大个数
 *      以以下场景为例编写demo
 *    典型应用场景：
 *          快手直播间里如何求得最大同时在线人数，每格用户进入时打个日志： userid enter timestamp; 离开时打个日志
 *          ：userid exit timestamp; 如何根据现有日志求得最大同时在线人数，需满足时间O(N),空间O(1)
 */
public class MaxOverlappingCount {

    /**
     * 把区间的起始点和结束点 定义成一个Point
     *  以直播间为例 起始就是enter  结束为exit
     */
    private static class Point implements Comparable<Point>{
        private String type;// enter 或者 exit

        private Long timestamp;// 区间边界的数值（时间点的最大毫秒数方便比较大小）

        public Point(String type,long timestamp){
            this.timestamp = timestamp;
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public int compareTo(Point o) {
            return timestamp.compareTo(o.timestamp);
        }
    }

    /**
     * 将所有区间的边界点进行排序，遍历统计，如果包含一个起始点计数+1，同时记录一次最大值，遇到一个结束点计数减1
     * 画一下图就很好理解
     * @param points
     * @return
     */

    public static int rangeOverlapMax(List<Point> points){
        if(points==null || points.isEmpty()){
            return 0;
        }
        int max = 0;
        int count = 0;
        sort(points);//如果日志是按照时间先后顺序打印，无需排序
        for (Point point:points) {
            if("enter".equals(point.type)){
                count++;
                max = Math.max(max,count);
            }else{
                count--;
            }
        }
        return max;
    }

    public static void main(String[] args){
        List<Point> points = new ArrayList<Point>();
        points.add(new Point("enter",1111111L));
        points.add(new Point("exit", 1112233L));

        points.add(new Point("enter",1111113L));
        points.add(new Point("exit", 1113233L));

        points.add(new Point("enter",1111114L));
        points.add(new Point("exit", 1115233L));

        points.add(new Point("enter",1121215L));
        points.add(new Point("exit", 1121233L));

        points.add(new Point("enter",1111116L));
        points.add(new Point("exit", 1117233L));

        points.add(new Point("enter",1121116L));
        points.add(new Point("exit", 1127233L));

        System.out.println(rangeOverlapMax(points));
    }


}
