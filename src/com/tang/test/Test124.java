package com.tang.test;

/** ClassName:Test124 Package:com.tang.test.testCallable @Date:2021/10/31 15:23 @Author:TYH */
public class Test124 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        /**
         * C:\Program Files\Java\jdk1.8.0_281\jre\lib\charsets.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\deploy.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\access-bridge-64.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\cldrdata.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\dnsns.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\jaccess.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\jfxrt.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\localedata.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\nashorn.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\sunec.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\sunjce_provider.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\sunmscapi.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\sunpkcs11.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\ext\zipfs.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\javaws.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\jce.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\jfr.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\jfxswt.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\jsse.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\management-agent.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\plugin.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\resources.jar; C:\Program
         * Files\Java\jdk1.8.0_281\jre\lib\rt.jar; D:\tools\IDEA\IntelliJ IDEA
         * 2017.3.1\projects\patternOfDesign\out\production\patternOfDesign; D:\tools\IDEA\IntelliJ
         * IDEA 2017.3.1\lib\idea_rt.jar
         */
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxValueOfNode(root);
        return maxValue;
    }
    /**
     * 功能描述 以node为根节点的最大路径
     *
     * @author TYH
     * @date 2021/10/31
     * @param * @param maxValue
     * @param node
     * @return int
     */
    public int maxValueOfNode(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftNodeValue = Math.max(0, maxValueOfNode(node.left));
        int rightNodeValue = Math.max(0, maxValueOfNode(node.right));
        maxValue = Math.max(maxValue, leftNodeValue + rightNodeValue + node.val);

        return leftNodeValue + rightNodeValue + node.val;
    }
}
