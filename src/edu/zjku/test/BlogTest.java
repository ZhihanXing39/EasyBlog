package edu.zjku.test;

import edu.zjku.bean.Blog;
import edu.zjku.service.BlogService;
import edu.zjku.service.BlogServiceImpl;
import org.junit.Test;

import java.util.List;

public class BlogTest {
    private BlogService service = new BlogServiceImpl();

    @Test
    public void selectAll() {
        List<Blog> lists = service.selectAll();
        for (Blog b : lists
        ) {
            System.out.println(b);
        }
    }
    @Test
    public void selectUnpass(){
        List<Blog> lists = service.selectUnpass();
        for (Blog b:lists
             ) {
            System.out.println(b);
        }
    }
    @Test
    public void selectPass(){
        List<Blog> blogs = service.selectPass();
        for (Blog b:blogs
             ) {
            System.out.println(b);
        }
    }

    @Test
    public void insert() {
        Blog blog = new Blog();
        blog.setTitle("重返地牢一");
        blog.setText("在这个世界上，存在着“岩德的传说”。据说那是创世神宝库中最为强大的宝物，一件护身符。当初世界还是一片混沌，没有日月星辰，没有白昼和黑夜，只有数不尽的黑暗。于是创世神使用了他那强大的力量，将世界分成了两半，清而白的升了起来，成为了天空，浊而黑的沉了下去，变成了大地。看到了如此满意的工作成果，创世神再度陷入了沉睡，并且把他的力量分解成了许许多多的宝物，岩德护身符就是这之中最为强大的那个。\n" +
                "不知从什么时候起，某些地区开始了频繁的地震。这些地区的地下居然生成了复杂的迷宫，并且迷宫随着时间而变化，没有人能够掌握其中的奥秘。又是不知什么时候开始，人们觉得那是因为地底埋藏着岩徳附身符，所以才会在强大力量的影响下不断地变化，于是许多冒险者纷纷涌入了这些迷宫，但几乎没有人能够在那充满陷阱和怪物的地牢中生还，于是人们把迷宫称为“厄运地牢”。在大陆上存在着许许多多的厄运地牢，但最为出名的还是奈菲亚了。\n" +
                "奈菲亚作为整个大陆数一数二的城邦，吸引着许多形形色色的冒险者，商人，赏金猎人。每个人都想在这里找到自己的机遇，从而成为暴发户或者名门望族什么的。对于冒险者来说，最有吸引力的当属厄运地牢了。这个无底洞般的区域几十年间吞没了无数冒险者，他们当中有的重新回到地面上，获得了强大的宝物，有的积攒了惊人的财富，一举成为富商大贾，但更多的人则是再也没有回来，从此杳无音信。\n" +
                "即便如此，每年还是有很多有勇无谋的莽夫溜进了地牢，为了那点虚无缥缈的成功概率。为了避免更多的人进去送死，城邦的领主只好派遣士兵把地牢入口封锁起来，只有特定的人员才可以进入地牢，但那些人多半是罪恶深重的罪犯。今天，地牢又迎来一名送死的人。\n" +
                "全副武装的士兵押送着一名身材魁梧的壮汉，他火一般的头发似乎在诉说着无尽的怒火。“嘿，伙计，这是今天送下去的家伙。”士兵把红发壮汉转交给看守地牢的士兵。\n" +
                "“啊——看来这就是惹恼了凯恩大公的家伙”\n" +
                "“没错，大公特地的交代了，只给他准备最低限度的装备。”\n" +
                "“放心，早就准备好了。”看守说完从背后拿出一个小小的背包。\n" +
                "“好，那就把他放进去吧！”\n" +
                "红发壮汉被推到了地牢门口，松绑后，他拿起了背包，踏进了地牢。在踏入那深不见底的黑暗之前，他听到士兵说：\n" +
                "“希望你的‘正义感’可以说服怪物们不攻击你，哈哈哈。”");
        blog.setUser("zhihanxing");
        service.insert(blog);
    }
    @Test
    public void delete(){
        Blog blog = new Blog();
        blog.setPid(4);
        service.delete(blog);
    }
    @Test
    public void update(){
        Blog blog = new Blog();
        blog.setTitle("重装系统解决百分之九十九的问题");
        blog.setText("微软的windows系统总是会出现各种各样、稀奇古怪的问题，重新启动电脑可能解决百分之九十九的问题。");
        blog.setPid(2);
        service.update(blog);
    }
    @Test
    public void allow(){
        Blog blog = new Blog();
        blog.setPid(5);
        service.allow(blog);
    }
}
