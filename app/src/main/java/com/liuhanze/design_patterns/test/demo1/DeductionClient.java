package com.liuhanze.design_patterns.test.demo1;

import com.liuhanze.iutil.log.ILog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeductionClient {

    public static void main(String[] args){
        Card card = initCard();
        showCardInfo(card);

        boolean flag = true;

        while (flag){
            Trade trade = createTrade(args[0],args[1]);
            DeductionFacade.deduct(card,trade);
            ILog.LogDebug(trade.getTradeNo()+"交易成功"+",本次发送交易的金额："+trade.getAmount()/100.0+"元");
            showCardInfo(card);
            if(args[2].equalsIgnoreCase("Y")){
                flag = false;
            }
        }

    }

    private static Trade createTrade(String tradeNo,String amount) {
        Trade trade = new Trade();
        trade.setTradeNo(tradeNo);
        trade.setAmount(Integer.parseInt(amount));
        return trade;
    }

    private static String getInput() {
        String str = "";
        try {
            str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    private static void showCardInfo(Card card) {
        ILog.LogDebug("IC卡号: "+card.getCardNo()+",固定余额: "+card.getSteadyMoney()/100.0+" 元"+",自由余额: "+card.getFreeMoney()/100.0+" 元");
    }

    private static Card initCard() {
        Card card = new Card();
        card.setCardNo("1000008888");
        card.setFreeMoney(100000);
        card.setSteadyMoney(80000);
        return card;
    }
}
