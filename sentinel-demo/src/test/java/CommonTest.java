import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * 〈通用测试〉
 *
 * @author LZ
 * @create 2020/4/24
 * @since 1.0.0
 */
public class CommonTest {


//    public static void main(String[] args) {
//        // 配置规则.
//        initFlowRules();
//
//        while (true) {
//            // 1.5.0 版本开始可以直接利用 try-with-resources 特性，自动 exit entry
//            try (Entry entry = SphU.entry("HelloWorld")) {
//                // 被保护的逻辑
//                System.out.println("hello world");
//            } catch (BlockException ex) {
//                // 处理被流控的逻辑
//                System.out.println("blocked!");
//            }
//        }
//    }
}
