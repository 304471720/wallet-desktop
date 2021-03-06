package com.credits.wallet.desktop.test;

import com.credits.common.exception.CreditsException;
import com.credits.wallet.desktop.utils.ApiUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Rustem Saidaliyev on 20-Mar-18.
 */
public class ApiUtilsTest {
    private static Logger LOGGER = LoggerFactory.getLogger(ApiUtilsTest.class);

    @Test
    public void generateTransactionHashTest() {
        try {
            LOGGER.info(ApiUtils.generateTransactionHash());
        } catch (CreditsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void callTransactionFlowWithFeeTest() {
        try {



            LOGGER.info(ApiUtils.generateTransactionHash());
        } catch (CreditsException e) {
            e.printStackTrace();
        }
    }
}
