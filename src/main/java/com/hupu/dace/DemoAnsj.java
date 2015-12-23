package com.hupu.dace;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.IndexAnalysis;
import org.ansj.splitWord.analysis.NlpAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.ansj.util.FilterModifWord;
import org.nlpcn.commons.lang.util.IOUtil;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xiaojun on 2015/12/18.
 */
public class DemoAnsj {
    public static void main(String[] args) throws Exception{
//        List<Term> parse = BaseAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
//        System.out.println(parse);
        List<Term> parse2 = ToAnalysis.parse("nike zoom clear out 实物 预览");
        System.out.println(parse2);
//        List<Term> parse3 = NlpAnalysis.parse("洁面仪配合洁面深层清洁毛孔 清洁鼻孔面膜碎觉使劲挤才能出一点点皱纹 脸颊毛孔修复的看不见啦 草莓鼻历史遗留问题没辙 脸和脖子差不多颜色的皮肤才是健康的 长期使用安全健康的比同龄人显小五到十岁 28岁的妹子看看你们的鱼尾纹");
//        System.out.println(parse3);
//        BufferedReader swreader = IOUtil.getReader("library/stopwords/zh.json", "utf-8");
//
//
//        Gson gson = new GsonBuilder().create();
//        List stopwords = gson.fromJson(swreader,List.class);
//        swreader.close();
//        FilterModifWord.insertStopWords(stopwords);
//        List<Term> parse4 = IndexAnalysis.parse("泰森公开恐吓巴克利，看看巴克利如何回应？强如巴爵士，面对泰森会认怂吗？");
//        parse4 = FilterModifWord.modifResult(parse4);
//        System.out.println(parse4);



    }
}
