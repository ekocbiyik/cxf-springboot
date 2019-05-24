package com.ekocbiyik;

import com.ekocbiyik.thirdparty.quota.*;
import org.springframework.stereotype.Controller;

/**
 * ekocbiyik on 24.05.2019
 */
@Controller("queryQuota")
public class QueryQuotaWebServiceImpl implements QueryQuotaWebService {

    @Override
    public GetExtDetailHistoryResultBean getExtDetailHistory(GetExtDetailHistoryInput parameters) {
        return null;
    }

    @Override
    public GetQuotaInfoHistoryResultBean getQuotaHistory(GetQuotaInfosHistoryInput parameters) {
        return null;
    }

    @Override
    public GetExtDetailInfoResultBean getExtDetailInfo(GetExtDetailInfoInput parameters) {
        return null;
    }

    @Override
    public GetQuotaInfoResultBean getQuotaInfo(GetQuotaInfoInput parameters) {
        return null;
    }
}
