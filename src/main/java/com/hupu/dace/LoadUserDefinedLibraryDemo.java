package com.hupu.dace;

import org.ansj.domain.Term;
import org.ansj.library.UserDefineLibrary;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.nlpcn.commons.lang.tire.domain.Forest;

import java.util.List;

/**
 * Created by xiaojun on 2015/12/18.
 */
public class LoadUserDefinedLibraryDemo {
    public static void main(String[] args) throws Exception{
        List<Term> parse2 = ToAnalysis.parse("让小汪汪过一个欢乐祥和的新春佳节。");
        System.out.println(parse2);
        UserDefineLibrary.loadLibrary(new Forest(), "udf/test.dic");
        Thread.sleep(2000);
        List<Term> parse3 = ToAnalysis.parse("让小汪汪过一个欢乐祥和的新春佳节。");
        System.out.println(parse3);
    }
}
