package com.fiserv.merchantmaintenance.dao;

public class SqlQuery {




    private SqlQuery() {

    }

    public static final String GET_ALL_WEATHER = "SELECT * FROM WEATHER WHERE SENSOR_ID = :sensorId  " +
            "                                                       AND CITY = :city  " +
            "                                                       AND COUNTRY = :country  " +
            "                                                       AND DATES BETWEEN :daysAgo AND :date  ";

    public static final String DROP_WEATHER = "drop table WEATHER";

    public static final String GET_WEATHER_NO_HUM = "SELECT AVG(TEMPERATURE) AS TEMPERATURE," +
                                                        " AVG(WIND_SPEED) AS WIND_SPEED, " +
                                                        " SENSOR_ID, " +
                                                        " CITY, " +
                                                        " COUNTRY " +
                                                        " FROM WEATHER " +
                                                        "  WHERE SENSOR_ID = :sensorId " +
                                                        "   AND CITY = :city " +
                                                        "   AND COUNTRY = :country " +
                                                        "   AND DATES BETWEEN :daysAgo AND :date ";

    public static final String GET_WEATHER_NO_WS = "SELECT AVG(TEMPERATURE) AS TEMPERATURE," +
                                                    " AVG(HUMIDITY) AS HUMIDITY, " +
                                                    " SENSOR_ID, " +
                                                    " CITY, " +
                                                    " COUNTRY " +
                                                    " FROM WEATHER " +
                                                    "  WHERE SENSOR_ID = :sensorId " +
                                                    "   AND CITY = :city " +
                                                    "   AND COUNTRY = :country " +
                                                    "   AND DATES BETWEEN :daysAgo AND :date " ;

    public static final String GET_WEATHER_NO_TEM = "SELECT AVG(HUMIDITY) AS HUMIDITY, " +
                                                        " AVG(WIND_SPEED) AS WIND_SPEED, " +
                                                        " SENSOR_ID, " +
                                                        " CITY, " +
                                                        " COUNTRY " +
                                                        " FROM WEATHER " +
                                                        "  WHERE SENSOR_ID = :sensorId " +
                                                        "   AND CITY = :city " +
                                                        "   AND COUNTRY = :country " +
                                                        "   AND DATES BETWEEN :daysAgo AND :date ";

    public static final String GET_WEATHER_TEM = "SELECT AVG(TEMPERATURE) AS TEMPERATURE," +
                                                    " SENSOR_ID, " +
                                                    " CITY, " +
                                                    " COUNTRY " +
                                                    " FROM WEATHER " +
                                                    "  WHERE SENSOR_ID = :sensorId " +
                                                    "   AND CITY = :city " +
                                                    "   AND COUNTRY = :country " +
                                                    "   AND DATES BETWEEN :daysAgo AND :date ";

    public static final String GET_WEATHER_WS = "SELECT AVG(WIND_SPEED) AS WIND_SPEED, " +
                                                " SENSOR_ID, " +
                                                " CITY, " +
                                                " COUNTRY " +
                                                " FROM WEATHER " +
                                                "  WHERE SENSOR_ID = :sensorId " +
                                                "   AND CITY = :city " +
                                                "   AND COUNTRY = :country " +
                                                "   AND DATES BETWEEN :daysAgo AND :date " ;

    public static final String GET_WEATHER_HUM = "SELECT AVG(HUMIDITY) AS HUMIDITY, " +
                                                    " SENSOR_ID, " +
                                                    " CITY, " +
                                                    " COUNTRY " +
                                                    " FROM WEATHER " +
                                                    "  WHERE SENSOR_ID = :sensorId " +
                                                    "   AND CITY = :city " +
                                                    "   AND COUNTRY = :country " +
                                                    "   AND DATES BETWEEN :daysAgo AND :date ";

    public static final String CREATE_WEATHER = "CREATE TABLE Weather (  " +
            "    SENSOR_ID int,  " +
            "    CITY varchar(255),  " +
            "    COUNTRY varchar(255),  " +
            "    TEMPERATURE int,  " +
            "    HUMIDITY int,  " +
            "    WIND_SPEED int,  " +
            "    DATES varchar(255),  " +
            "    PRIMARY KEY (SENSOR_ID, CITY, COUNTRY, DATES)  " +
            ") ";

    public static final String INSERT_VALUES = "INSERT INTO Weather     " +
            "      (TEMPERATURE, HUMIDITY, WIND_SPEED, DATES, SENSOR_ID, CITY, COUNTRY)     " +
            "     VALUES     " +
            "    (11, 6, 18, '20220106', 1, 'Dublin', 'Ireland')";

    public static final String GET_WEATHER_UNIQUE = "SELECT *    " +
                                                    "    FROM WEATHER   " +
                                                    "     WHERE SENSOR_ID = :sensorId " +
                                                    "      AND CITY = :city  " +
                                                    "      AND COUNTRY = :country  " +
                                                    "      AND DATES = :date";


    public static final String GET_DATE = "SELECT POSTING_DATE FROM SYS_POSTING_DATE SPD WHERE SPD.INSTITUTION_NUMBER = '00000033' AND SPD.STATION_NUMBER = '129' ";

    public static final String GET_WEATHER = "SELECT * "  +
                                            " FROM WEATHER ";


    public static final String UPDATE_WEATHER = "UPDATE WEATHER  " +
            "  SET TEMPERATURE = NVL(:temperature, TEMPERATURE), " +
            "   HUMIDITY = NVL(:humidity, HUMIDITY), " +
            "   WIND_SPEED = NVL(:windSpeed, WIND_SPEED) " +
            " WHERE SENSOR_ID =  :sensorId " +
            "  AND CITY = :city " +
            "  AND COUNTRY = :country" +
            "  AND DATES = :date";


    public static final String INSERT_WEATHER = "INSERT INTO WEATHER " +
            "  (TEMPERATURE, HUMIDITY, WIND_SPEED, DATES, SENSOR_ID, CITY, COUNTRY) " +
            " VALUES " +
            "(:temperature, :humidity, :windSpeed, :date, :sensorId, :city, :country)";

    public static final String GET_CLIENT_DETAILS_CONTRACTS = "SELECT CCL.EFFECTIVE_DATE,    " +
                                                            "        CCL.SERVICE_CONTRACT_ID,     " +
                                                            "        CCL.CONTRACT_STATUS,     " +
                                                            "        BCS2.CLIENT_STATUS CONTRACT_STATUS_TEXT,     " +
                                                            "        BSCI.SERVICE_CONTRACT SERVICE_CONTRACT_ID_TEXT,     " +
                                                            "        CCD.CLIENT_REGION,   " +
                                                            "        BR.REGION CLIENT_REGION_TEXT,   " +
                                                            "        CCD.MARITAL_STATUS CHARGEBACK_FX_PROTECTED,   " +
                                                            "        CCL.PROVIDER_ACCT_OFFICER PAYMENT_METHOD,   " +
                                                            "        BAO2.ACCOUNT_OFFICER PAYMENT_METHOD_TEXT,   " +
                                                            "        CCD.BILLBACK_INDICATOR,     " +
                                                            "        BBI.BILLBACK_INDICATOR BILLBACK_INDICATOR_TEXT,   " +
                                                            "        CCA.MUNICIPAL_TAX_IND,     " +
                                                            "        BC_MUNICIPAL.CONFIRMATION MUNICIPAL_TAX_IND_TEXT,     " +
                                                            "        BACS_INCOME_TAX.INDEX_FIELD INCOME_TAX_IND,     " +
                                                            "        BACS_INCOME_TAX.CONDITION_SET INCOME_TAX_IND_TEXT,   " +
                                                            "        BACS_VAT_TAX.INDEX_FIELD VAT_TAX_IND,     " +
                                                            "        BACS_VAT_TAX.CONDITION_SET VAT_TAX_IND_TEXT,     " +
                                                            "        BACS.INDEX_FIELD CLIENT_TARIFF,     " +
                                                            "        BACS.CONDITION_SET CLIENT_TARIFF_TEXT,     " +
                                                            "        BPT.INDEX_FIELD POSTING_TARIFF,     " +
                                                            "        BPT.POSTING_METHOD POSTING_TARIFF_TEXT,     " +
                                                            "        BSM.INDEX_FIELD SETTLEMENT_METHOD,     " +
                                                            "        BSM.SETTLEMENT_METHOD SETTLEMENT_METHOD_TEXT,     " +
                                                            "        BTG.INDEX_FIELD TIER_GROUP,    " +
                                                            "        BTG.TIER_GROUP TIER_GROUP_TEXT    " +
                                                            "         FROM CIS_CLIENT_LINKS CCL    " +
                                                            "         LEFT OUTER JOIN CIS_CLIENT_DETAILS CCD ON CCL.INSTITUTION_NUMBER =  CCD.INSTITUTION_NUMBER     " +
                                                            "                                                                         AND CCL.CLIENT_NUMBER = CCD.CLIENT_NUMBER                                                                             " +
                                                            "         LEFT OUTER JOIN BWT_CLIENT_STATUS BCS2 ON CCL.CONTRACT_STATUS = BCS2.INDEX_FIELD     " +
                                                            "                                                                                AND CCL.INSTITUTION_NUMBER =  BCS2.INSTITUTION_NUMBER     " +
                                                            "                                                                                AND BCS2.LANGUAGE = 'USA'    " +
                                                            "         LEFT OUTER JOIN BWT_SERVICE_CONTRACT_ID BSCI ON CCL.SERVICE_CONTRACT_ID = BSCI.INDEX_FIELD     " +
                                                            "                                                                           AND CCL.INSTITUTION_NUMBER =  BSCI.INSTITUTION_NUMBER     " +
                                                            "                                                                           AND BSCI.LANGUAGE = 'USA'    " +
                                                            "         LEFT OUTER JOIN BWT_REGION BR ON CCD.CLIENT_REGION = BR.INDEX_FIELD     " +
                                                            "                                                                    AND CCL.INSTITUTION_NUMBER =  BR.INSTITUTION_NUMBER     " +
                                                            "                                                                    AND BR.LANGUAGE = 'USA'     " +
                                                            "         LEFT OUTER JOIN BWT_ACCOUNT_OFFICER BAO2 ON CCL.PROVIDER_ACCT_OFFICER  = BAO2.INDEX_FIELD     " +
                                                            "                                                                                  AND CCL.INSTITUTION_NUMBER =  BAO2.INSTITUTION_NUMBER     " +
                                                            "                                                                                  AND BAO2.LANGUAGE = 'USA'     " +
                                                            "         LEFT OUTER JOIN BWT_BILLBACK_INDICATOR BBI ON CCD.BILLBACK_INDICATOR  = BBI.INDEX_FIELD     " +
                                                            "                                                                                  AND CCL.INSTITUTION_NUMBER =  BBI.INSTITUTION_NUMBER     " +
                                                            "                                                                                  AND BBI.LANGUAGE = 'USA'                                                           " +
                                                            "         LEFT OUTER JOIN CIS_CLIENT_ADDENDUM CCA ON CCL.INSTITUTION_NUMBER =  CCA.INSTITUTION_NUMBER     " +
                                                            "                                                                                    AND CCL.CLIENT_NUMBER = CCA.CLIENT_NUMBER   " +
                                                            "         LEFT OUTER JOIN BWT_CONFIRMATION BC_MUNICIPAL ON CCA.MUNICIPAL_TAX_IND  = BC_MUNICIPAL.INDEX_FIELD     " +
                                                            "                                                                                            AND CCL.INSTITUTION_NUMBER =  BC_MUNICIPAL.INSTITUTION_NUMBER     " +
                                                            "                                                                                            AND BC_MUNICIPAL.LANGUAGE = 'USA'                                                                                " +
                                                            "         LEFT OUTER JOIN BWT_ACCOUNT_CONDITION_SET BACS_INCOME_TAX ON CCA.INCOME_TAX_IND = BACS_INCOME_TAX.INDEX_FIELD     " +
                                                            "                                                                           AND CCL.INSTITUTION_NUMBER =  BACS_INCOME_TAX.INSTITUTION_NUMBER     " +
                                                            "                                                                           AND BACS_INCOME_TAX.LANGUAGE = 'USA'                                                                                " +
                                                            "         LEFT OUTER JOIN BWT_ACCOUNT_CONDITION_SET BACS_VAT_TAX ON CCA.VAT_TAX_IND = BACS_VAT_TAX.INDEX_FIELD     " +
                                                            "                                                                           AND CCL.INSTITUTION_NUMBER =  BACS_VAT_TAX.INSTITUTION_NUMBER     " +
                                                            "                                                                           AND BACS_VAT_TAX.LANGUAGE = 'USA'                                                                             " +
                                                            "         LEFT OUTER JOIN BWT_ACCOUNT_CONDITION_SET BACS ON CCL.CLIENT_TARIFF = BACS.INDEX_FIELD     " +
                                                            "                                                                           AND CCL.INSTITUTION_NUMBER =  BACS.INSTITUTION_NUMBER     " +
                                                            "                                                                           AND BACS.LANGUAGE = 'USA'                                                                              " +
                                                            "         LEFT OUTER JOIN BWT_POSTING_TARIFF BPT ON CCL.POSTING_METHOD = BPT.INDEX_FIELD     " +
                                                            "                                                                           AND CCL.INSTITUTION_NUMBER =  BPT.INSTITUTION_NUMBER     " +
                                                            "                                                                           AND BPT.LANGUAGE = 'USA'                                                                            " +
                                                            "         LEFT OUTER JOIN BWT_SETTLEMENT_METHOD BSM ON CCL.SETTLEMENT_METHOD = BSM.INDEX_FIELD     " +
                                                            "                                                                           AND CCL.INSTITUTION_NUMBER =  BSM.INSTITUTION_NUMBER     " +
                                                            "                                                                           AND BSM.LANGUAGE = 'USA'    " +
                                                            "         LEFT OUTER JOIN BWT_TIER_GROUP BTG ON NVL(CCL.TIER_GROUP,'000') = BTG.INDEX_FIELD     " +
                                                            "                                                                           AND CCL.INSTITUTION_NUMBER =  BTG.INSTITUTION_NUMBER     " +
                                                            "                                                                           AND BTG.LANGUAGE = 'USA'     " +
                                                            "      WHERE CCL.INSTITUTION_NUMBER = :institutionNumber " +
                                                            "                          AND CCL.CLIENT_NUMBER = :internalMerchantId  " +
                                                            "                           AND CCL.CLIENT_LEVEL IN (  SELECT MAX( CCLM.CLIENT_LEVEL)           " +
                                                            "                            FROM CIS_CLIENT_LINKS CCLM           " +
                                                            "                              WHERE CCLM.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER           " +
                                                            "                               AND CCLM.CLIENT_NUMBER = CCL.CLIENT_NUMBER           " +
                                                            "                               AND CCLM.EFFECTIVE_DATE = CCL.EFFECTIVE_DATE)  ";

    public static final String QUERY_VALIDATE_MERCHANT_ADDRESS_CATEGORY = "SELECT CA.ADDRESS_CATEGORY FROM  BW3.CIS_ADDRESSES CA WHERE CA.INSTITUTION_NUMBER = :institutionNumber AND CA.CLIENT_NUMBER = :internalMerchantId AND CA.ADDRESS_CATEGORY = :addressCategory ";

    public static final String QUERY_VALIDATE_SERVICE_ID = "SELECT SCS.SERVICE_ID FROM SVC_CLIENT_SERVICE SCS WHERE SCS.INSTITUTION_NUMBER = :institutionNumber AND SCS.CLIENT_NUMBER = :internalMerchantId AND SCS.SERVICE_ID = :serviceIdIndex ";

    public static final String QUERY_VALIDATE_INSTITUTION_ALLOWED_ADDRESS_CATEGORY = "select address_category from cbr_address_validation where institution_number = :institutionNumber ";

    public static final String QUERY_VALIDATE_POSTING_DATE = "SELECT POSTING_DATE FROM SYS_POSTING_DATE SPD WHERE SPD.INSTITUTION_NUMBER = :institutionNumber AND SPD.STATION_NUMBER = '129' ";

    public static final String QUERY_VALIDATE_FLOOR_LIMIT = "SELECT * FROM CBR_MERCHANT_FLOORLIMIT SCS WHERE SCS.INSTITUTION_NUMBER = :institutionNumber " +
            "                  AND SCS.CLIENT_NUMBER = :internalMerchantId " +
            "                  AND SCS.SERVICE_ID = :serviceIndex";

    public static final String QUERY_GET_SERVICE_TO_INSTITUTION = "SELECT ROWNUM, a.*  " +
                                                                        "  FROM (  SELECT DISTINCT BSCI.INDEX_FIELD SERVICE_CONTACT_ID,  " +
                                                                        "                          BSCI.SERVICE_CONTRACT SERVICE_CONTACT_ID_DESCRIPTION,  " +
                                                                        "                          BS.INDEX_FIELD SERVICE_CODE,  " +
                                                                        "                          BS.SERVICE_ID SERVICE_DESCRIPTION  " +
                                                                        "            FROM CBR_TRANSACTION_CHARGES CTC  " +
                                                                        "                 INNER JOIN BWT_SERVICE_CONTRACT_ID BSCI  " +
                                                                        "                    ON     CTC.INSTITUTION_NUMBER = BSCI.INSTITUTION_NUMBER  " +
                                                                        "                       AND CTC.SERVICE_CONTRACT_ID = BSCI.INDEX_FIELD  " +
                                                                        "                       AND BSCI.LANGUAGE = 'USA'  " +
                                                                        "                 INNER JOIN BWT_SERVICES BS  " +
                                                                        "                    ON     CTC.INSTITUTION_NUMBER = BS.INSTITUTION_NUMBER  " +
                                                                        "                       AND CTC.SERVICE_ID = BS.INDEX_FIELD  " +
                                                                        "                       AND BS.LANGUAGE = 'USA'  " +
                                                                        "           WHERE     CTC.INSTITUTION_NUMBER = :institutionNumber  " +
                                                                        "                 AND CTC.CLIENT_NUMBER = '00000000'  " +
                                                                        "                 AND SERVICE_CONTRACT_ID = :serviceContract  " +
                                                                        "        ORDER BY 1, 3) a ";

    public static final String QUERY_VALIDATE_MERCHANT_SUB_ID_INSERT = "SELECT *  " +
                                                                        "FROM OMNI_PROD.OMNI_IDEAL_MERCH_MAINT_DETAILS  " +
                                                                        "WHERE INSTITUTION_NUMBER = :institutionNumber " +
                                                                        " AND CLIENT_NUMBER = :internalMerchantId ";

    public static final String QUERY_VALIDATE_JCB_CLIENT_DETAILS = "SELECT *  " +
                                                                "FROM OMNI_PROD.OMNI_JCB_CLIENT_DETAILS  " +
                                                                "WHERE INSTITUTION_NUMBER = :institutionNumber  " +
                                                                " AND CLIENT_NUMBER = :internalMerchantId  " +
                                                                " AND SERVICE_ID = :serviceIndex ";

    public static final String QUERY_VALIDATE_MERCHANT_SUB_ID = "SELECT COUNT(*)  " +
                                                                "FROM OMNI_PROD.OMNI_IDEAL_MERCH_MAINT_DETAILS  " +
                                                                "WHERE INSTITUTION_NUMBER = :institutionNumber  " +
                                                                "  AND MERCHANT_SUB_ID = :merchantSubId " +
                                                                "  AND CLIENT_NUMBER NOT IN (:internalMerchantId)  ";

    public static final String QUERY_VALIDATE_SERVICE_ID_AND_SERVICE_CONTRACT_FOR_MERCHANT = "SELECT * " +
            "FROM SVC_CLIENT_SERVICE  " +
            "WHERE INSTITUTION_NUMBER =  :institutionNumber  " +
            "  AND CLIENT_NUMBER = :internalMerchantId " +
            "  AND SERVICE_CONTRACT_ID = :serviceContractId " +
            "  AND SERVICE_ID = :serviceIndex ";

    public static final String QUERY_VALIDATE_SERVICE_ID_AND_SERVICE_CONTRACT = "SELECT * " +
            "FROM CBR_ASSIGNED_SERVICES " +
            "WHERE INSTITUTION_NUMBER = :institutionNumber" +
            "  AND SERVICE_CONTRACT_ID = :serviceContractId " +
            "  AND SERVICE_ID = :serviceIndex ";

    public static final String QUERY_VALIDATE_MEMBER_MERCHANT = "SELECT MAX(CCL.CLIENT_LEVEL) MAX_CLIENT_LEVEL " +
            "FROM CIS_CLIENT_LINKS CCL " +
            "WHERE CCL.INSTITUTION_NUMBER = :institutionNumber " +
            "  AND CCL.CLIENT_NUMBER = :internalMerchantId " +
            "    AND CCL.EXPIRY_DATE >= ( SELECT SPD.POSTING_DATE " +
            "            FROM SYS_POSTING_DATE SPD " +
            "            WHERE SPD.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
            "            AND SPD.STATION_NUMBER = '129') " +
            "  AND CCL.EFFECTIVE_DATE = ( SELECT MAX(CCL_MAX.EFFECTIVE_DATE) " +
            "                             FROM CIS_CLIENT_LINKS CCL_MAX " +
            "                             WHERE CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
            "                               AND CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
            "                               AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER " +
            "                               AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID " +
            "                               AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL) " +
            " GROUP BY CCL.CONTRACT_STATUS";

    public static final String UPDATE_MERCHANT_ADDRESS = "UPDATE CIS_ADDRESSES CA " +
            " SET CA.AUDIT_TRAIL = :auditTrail , " +
            "    CA.CONTACT_NAME = NVL( :contactName, CA.CONTACT_NAME) , " +
            "    CA.ADDR_LINE_1 = NVL( :line1, CA.ADDR_LINE_1 ) , " +
            "    CA.ADDR_LINE_2 = NVL( :line2, CA.ADDR_LINE_2 ) , " +
            "    CA.ADDR_LINE_3 = NVL( :line3, CA.ADDR_LINE_3 ) , " +
            "    CA.ADDR_LINE_4 = NVL( :line4, CA.ADDR_LINE_4 ) , " +
            "    CA.ADDR_LINE_5 = NVL( :line5, CA.ADDR_LINE_5 ) , " +
            "    CA.POST_CODE = NVL( :postCode, CA.POST_CODE )," +
            "    CA.ADDR_CLIENT_CITY = NVL( :city, CA.ADDR_CLIENT_CITY ) , " +
            "    CA.CLIENT_COUNTRY = NVL( :countryCode, CA.CLIENT_COUNTRY ) , " +
            "    CA.CLIENT_STATE = NVL(  :state, CA.CLIENT_STATE ) , " +
            "    CA.TEL_WORK = NVL(:telephone, CA.TEL_WORK ), " +
            "    CA.FAX_WORK = NVL( :fax, CA.FAX_WORK ), " +
            "    CA.EMAIL_ADDR = NVL( :email, CA.EMAIL_ADDR ), " +
            "    CA.DELIVERY_METHOD = NVL( :deliveryMethodIndex, CA.DELIVERY_METHOD ) " +
            " WHERE CA.INSTITUTION_NUMBER = :institutionNumber " +
            "  AND CA.CLIENT_NUMBER = :internalMerchantId  " +
            "  AND CA.ADDRESS_CATEGORY = :category " +
            "  AND CA.EFFECTIVE_DATE = :effectiveDate ";

    public static final String INSERT_MERCHANT_ADDRESS = "INSERT INTO BW3.CIS_ADDRESSES " +
            "   (INSTITUTION_NUMBER, CLIENT_NUMBER, ADDRESS_CATEGORY, RECORD_DATE, EFFECTIVE_DATE, " +
            "    ADDR_LINE_1, ADDR_LINE_2, ADDR_LINE_3, ADDR_LINE_4,ADDR_LINE_5, POST_CODE, " +
            "    ADDR_CLIENT_CITY, CLIENT_COUNTRY, AUDIT_TRAIL, RECORD_TYPE, TEL_WORK, CLIENT_STATE, " +
            "    FAX_WORK, CONTACT_NAME, EMAIL_ADDR, DELIVERY_METHOD, GROUP_NUMBER) " +
            " VALUES " +
            "   (:institutionNumber, :internalMerchantId, :category, TO_CHAR( SYSDATE, 'yyyymmdd'), :effectiveDate, " +
            "    :line1, :line2, :line3, :line4, :line5, :postCode, " +
            "    :city, :countryCode, :auditTrail, '003', :telephone, :state, " +
            "    :fax, :contactName, :email, :deliveryMethodIndex, '99999999') ";

    public static final String DELETE_MERCHANT_ADDRESS = "DELETE FROM BW3.CIS_ADDRESSES CA" +
            " WHERE CA.INSTITUTION_NUMBER  = :institutionNumber " +
            "  AND CA.CLIENT_NUMBER = :internalMerchantId " +
            "  AND CA.ADDRESS_CATEGORY = :addressCategoryIndex " +
            "  AND CA.EFFECTIVE_DATE = :addressEffectiveDate";


    public static final String QUERY_VALIDATE_GET_INSTITUTION_NUMBER = "SELECT INSTITUTION_NUMBER FROM SYS_INSTITUTION_LICENCE WHERE INSTITUTION_NUMBER = :institutionNumber";

    public static final String QUERY_VALIDATE_GET_INTERNAL_MERCHANT_ID = "SELECT CLIENT_NUMBER FROM CIS_CLIENT_DETAILS WHERE INSTITUTION_NUMBER = :institutionNumber AND CLIENT_NUMBER = :internalMerchantId ";

    public static final String QUERY_GET_ALL_MERCHANT_ADDRESSES_NO_CATEGORY = "SELECT * " +
            "  FROM (SELECT CA.ADDRESS_CATEGORY, " +
            "               NVL ( " +
            "                  TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), " +
            "                           'YYYYMMDD'), " +
            "                  '') " +
            "                  LAST_UPDATED, " +
            "               (SELECT SUI.USERNAME " +
            "                  FROM SYS_USER_INFORMATION SUI " +
            "                 WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6) " +
            "                UNION ALL " +
            "                SELECT OUP.CONTACT_NAME " +
            "                  FROM OMNI_USER_PROFILE OUP " +
            "                 WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) " +
            "                  LAST_UPDATED_BY, " +
            "               CASE " +
            "                  WHEN CA.EFFECTIVE_DATE > " +
            "                          (SELECT SPD.POSTING_DATE " +
            "                             FROM SYS_POSTING_DATE SPD " +
            "                            WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND SPD.STATION_NUMBER = '129') " +
            "                  THEN " +
            "                     'FUTURE' " +
            "                  WHEN CA.EFFECTIVE_DATE = " +
            "                          (SELECT MAX (CA_MAX.EFFECTIVE_DATE) " +
            "                             FROM CIS_ADDRESSES CA_MAX " +
            "                            WHERE     CA_MAX.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND CA_MAX.CLIENT_NUMBER = CA.CLIENT_NUMBER " +
            "                                  AND CA_MAX.ADDRESS_CATEGORY = " +
            "                                         CA.ADDRESS_CATEGORY " +
            "                                  AND CA_MAX.EFFECTIVE_DATE <= " +
            "                                         (SELECT SPD.POSTING_DATE " +
            "                                            FROM SYS_POSTING_DATE SPD " +
            "                                           WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                                        CA.INSTITUTION_NUMBER " +
            "                                                 AND SPD.STATION_NUMBER = " +
            "                                                        '129')) " +
            "                  THEN " +
            "                     'ACTIVE' " +
            "                  ELSE " +
            "                     'INACTIVE' " +
            "               END " +
            "                  ADDRESS_STATUS, " +
            "               AC.ADDRESS_CATEGORY ADDRESS_CATEGORY_TEXT, " +
            "               CA.EFFECTIVE_DATE, " +
            "               CA.CONTACT_NAME, " +
            "               CA.ADDR_LINE_1, " +
            "               CA.ADDR_LINE_2, " +
            "               CA.ADDR_LINE_3, " +
            "               CA.ADDR_LINE_4, " +
            "               CA.ADDR_LINE_5, " +
            "               CA.GROUP_NUMBER, " +
            "               CA.POST_CODE, " +
            "               CA.ADDR_CLIENT_CITY, " +
            "               CA.CLIENT_COUNTRY, " +
            "               CTRY.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT, " +
            "               CA.CLIENT_STATE, " +
            "               CA.TEL_WORK, " +
            "               CA.FAX_WORK, " +
            "               CA.EMAIL_ADDR, " +
            "               CA.DELIVERY_METHOD, " +
            "               DEL.DESCRIPTION " +
            "          FROM BW3.CIS_ADDRESSES CA " +
            "               LEFT OUTER JOIN BWT_ADDRESS_CATEGORY AC " +
            "                  ON     CA.INSTITUTION_NUMBER = AC.INSTITUTION_NUMBER " +
            "                     AND CA.ADDRESS_CATEGORY = AC.INDEX_FIELD " +
            "                     AND AC.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_COUNTRY CTRY " +
            "                  ON     CA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER " +
            "                     AND CA.CLIENT_COUNTRY = CTRY.INDEX_FIELD " +
            "                     AND CTRY.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_DELIVERY DEL " +
            "                  ON     CA.INSTITUTION_NUMBER = DEL.INSTITUTION_NUMBER " +
            "                     AND CA.DELIVERY_METHOD = DEL.INDEX_FIELD " +
            "                     AND DEL.LANGUAGE = 'USA' " +
            "         WHERE     CA.INSTITUTION_NUMBER =  :institutionNumber  " +
            "               AND CA.CLIENT_NUMBER =  :internalMerchantId )";

    public static final String QUERY_GET_ACTIVE_MERCHANT_ADDRESSES_NO_CATEGORY = "SELECT * " +
            "  FROM (SELECT CA.ADDRESS_CATEGORY, " +
            "               NVL ( " +
            "                  TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), " +
            "                           'YYYYMMDD'), " +
            "                  '') " +
            "                  LAST_UPDATED, " +
            "               (SELECT SUI.USERNAME " +
            "                  FROM SYS_USER_INFORMATION SUI " +
            "                 WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6) " +
            "                UNION ALL " +
            "                SELECT OUP.CONTACT_NAME " +
            "                  FROM OMNI_USER_PROFILE OUP " +
            "                 WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) " +
            "                  LAST_UPDATED_BY, " +
            "               CASE " +
            "                  WHEN CA.EFFECTIVE_DATE > " +
            "                          (SELECT SPD.POSTING_DATE " +
            "                             FROM SYS_POSTING_DATE SPD " +
            "                            WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND SPD.STATION_NUMBER = '129') " +
            "                  THEN " +
            "                     'FUTURE' " +
            "                  WHEN CA.EFFECTIVE_DATE = " +
            "                          (SELECT MAX (CA_MAX.EFFECTIVE_DATE) " +
            "                             FROM CIS_ADDRESSES CA_MAX " +
            "                            WHERE     CA_MAX.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND CA_MAX.CLIENT_NUMBER = CA.CLIENT_NUMBER " +
            "                                  AND CA_MAX.ADDRESS_CATEGORY = " +
            "                                         CA.ADDRESS_CATEGORY " +
            "                                  AND CA_MAX.EFFECTIVE_DATE <= " +
            "                                         (SELECT SPD.POSTING_DATE " +
            "                                            FROM SYS_POSTING_DATE SPD " +
            "                                           WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                                        CA.INSTITUTION_NUMBER " +
            "                                                 AND SPD.STATION_NUMBER = " +
            "                                                        '129')) " +
            "                  THEN " +
            "                     'ACTIVE' " +
            "                  ELSE " +
            "                     'INACTIVE' " +
            "               END " +
            "                  ADDRESS_STATUS, " +
            "               AC.ADDRESS_CATEGORY ADDRESS_CATEGORY_TEXT, " +
            "               CA.EFFECTIVE_DATE, " +
            "               CA.CONTACT_NAME, " +
            "               CA.ADDR_LINE_1, " +
            "               CA.ADDR_LINE_2, " +
            "               CA.ADDR_LINE_3, " +
            "               CA.ADDR_LINE_4, " +
            "               CA.ADDR_LINE_5, " +
            "               CA.GROUP_NUMBER, " +
            "               CA.POST_CODE, " +
            "               CA.ADDR_CLIENT_CITY, " +
            "               CA.CLIENT_COUNTRY, " +
            "               CTRY.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT, " +
            "               CA.CLIENT_STATE, " +
            "               CA.TEL_WORK, " +
            "               CA.FAX_WORK, " +
            "               CA.EMAIL_ADDR, " +
            "               CA.DELIVERY_METHOD, " +
            "               DEL.DESCRIPTION " +
            "          FROM BW3.CIS_ADDRESSES CA " +
            "               LEFT OUTER JOIN BWT_ADDRESS_CATEGORY AC " +
            "                  ON     CA.INSTITUTION_NUMBER = AC.INSTITUTION_NUMBER " +
            "                     AND CA.ADDRESS_CATEGORY = AC.INDEX_FIELD " +
            "                     AND AC.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_COUNTRY CTRY " +
            "                  ON     CA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER " +
            "                     AND CA.CLIENT_COUNTRY = CTRY.INDEX_FIELD " +
            "                     AND CTRY.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_DELIVERY DEL " +
            "                  ON     CA.INSTITUTION_NUMBER = DEL.INSTITUTION_NUMBER " +
            "                     AND CA.DELIVERY_METHOD = DEL.INDEX_FIELD " +
            "                     AND DEL.LANGUAGE = 'USA' " +
            "         WHERE     CA.INSTITUTION_NUMBER =  :institutionNumber  " +
            "               AND CA.CLIENT_NUMBER =  :internalMerchantId ) " +
            " WHERE ADDRESS_STATUS = 'ACTIVE'";

    public static final String QUERY_GET_FUTURE_CLIENT_ADDRESSES_NO_CATEGORY = "SELECT * " +
            "  FROM (SELECT CA.ADDRESS_CATEGORY, " +
            "               NVL ( " +
            "                  TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), " +
            "                           'YYYYMMDD'), " +
            "                  '') " +
            "                  LAST_UPDATED, " +
            "               (SELECT SUI.USERNAME " +
            "                  FROM SYS_USER_INFORMATION SUI " +
            "                 WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6) " +
            "                UNION ALL " +
            "                SELECT OUP.CONTACT_NAME " +
            "                  FROM OMNI_USER_PROFILE OUP " +
            "                 WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) " +
            "                  LAST_UPDATED_BY, " +
            "               CASE " +
            "                  WHEN CA.EFFECTIVE_DATE > " +
            "                          (SELECT SPD.POSTING_DATE " +
            "                             FROM SYS_POSTING_DATE SPD " +
            "                            WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND SPD.STATION_NUMBER = '129') " +
            "                  THEN " +
            "                     'FUTURE' " +
            "                  WHEN CA.EFFECTIVE_DATE = " +
            "                          (SELECT MAX (CA_MAX.EFFECTIVE_DATE) " +
            "                             FROM CIS_ADDRESSES CA_MAX " +
            "                            WHERE     CA_MAX.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND CA_MAX.CLIENT_NUMBER = CA.CLIENT_NUMBER " +
            "                                  AND CA_MAX.ADDRESS_CATEGORY = " +
            "                                         CA.ADDRESS_CATEGORY " +
            "                                  AND CA_MAX.EFFECTIVE_DATE <= " +
            "                                         (SELECT SPD.POSTING_DATE " +
            "                                            FROM SYS_POSTING_DATE SPD " +
            "                                           WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                                        CA.INSTITUTION_NUMBER " +
            "                                                 AND SPD.STATION_NUMBER = " +
            "                                                        '129')) " +
            "                  THEN " +
            "                     'ACTIVE' " +
            "                  ELSE " +
            "                     'INACTIVE' " +
            "               END " +
            "                  ADDRESS_STATUS, " +
            "               AC.ADDRESS_CATEGORY ADDRESS_CATEGORY_TEXT, " +
            "               CA.EFFECTIVE_DATE, " +
            "               CA.CONTACT_NAME, " +
            "               CA.ADDR_LINE_1, " +
            "               CA.ADDR_LINE_2, " +
            "               CA.ADDR_LINE_3, " +
            "               CA.ADDR_LINE_4, " +
            "               CA.ADDR_LINE_5, " +
            "               CA.GROUP_NUMBER, " +
            "               CA.POST_CODE, " +
            "               CA.ADDR_CLIENT_CITY, " +
            "               CA.CLIENT_COUNTRY, " +
            "               CTRY.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT, " +
            "               CA.CLIENT_STATE, " +
            "               CA.TEL_WORK, " +
            "               CA.FAX_WORK, " +
            "               CA.EMAIL_ADDR, " +
            "               CA.DELIVERY_METHOD, " +
            "               DEL.DESCRIPTION " +
            "          FROM BW3.CIS_ADDRESSES CA " +
            "               LEFT OUTER JOIN BWT_ADDRESS_CATEGORY AC " +
            "                  ON     CA.INSTITUTION_NUMBER = AC.INSTITUTION_NUMBER " +
            "                     AND CA.ADDRESS_CATEGORY = AC.INDEX_FIELD " +
            "                     AND AC.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_COUNTRY CTRY " +
            "                  ON     CA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER " +
            "                     AND CA.CLIENT_COUNTRY = CTRY.INDEX_FIELD " +
            "                     AND CTRY.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_DELIVERY DEL " +
            "                  ON     CA.INSTITUTION_NUMBER = DEL.INSTITUTION_NUMBER " +
            "                     AND CA.DELIVERY_METHOD = DEL.INDEX_FIELD " +
            "                     AND DEL.LANGUAGE = 'USA' " +
            "         WHERE     CA.INSTITUTION_NUMBER =  :institutionNumber  " +
            "               AND CA.CLIENT_NUMBER =  :internalMerchantId ) " +
            " WHERE ADDRESS_STATUS = 'FUTURE'";

    public static final String QUERY_GET_ALL_MERCHANT_ADDRESSES = "SELECT * " +
            "  FROM (SELECT CA.ADDRESS_CATEGORY, " +
            "               NVL ( " +
            "                  TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), " +
            "                           'YYYYMMDD'), " +
            "                  '') " +
            "                  LAST_UPDATED, " +
            "               (SELECT SUI.USERNAME " +
            "                  FROM SYS_USER_INFORMATION SUI " +
            "                 WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6) " +
            "                UNION ALL " +
            "                SELECT OUP.CONTACT_NAME " +
            "                  FROM OMNI_USER_PROFILE OUP " +
            "                 WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) " +
            "                  LAST_UPDATED_BY, " +
            "               CASE " +
            "                  WHEN CA.EFFECTIVE_DATE > " +
            "                          (SELECT SPD.POSTING_DATE " +
            "                             FROM SYS_POSTING_DATE SPD " +
            "                            WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND SPD.STATION_NUMBER = '129') " +
            "                  THEN " +
            "                     'FUTURE' " +
            "                  WHEN CA.EFFECTIVE_DATE = " +
            "                          (SELECT MAX (CA_MAX.EFFECTIVE_DATE) " +
            "                             FROM CIS_ADDRESSES CA_MAX " +
            "                            WHERE     CA_MAX.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND CA_MAX.CLIENT_NUMBER = CA.CLIENT_NUMBER " +
            "                                  AND CA_MAX.ADDRESS_CATEGORY = " +
            "                                         CA.ADDRESS_CATEGORY " +
            "                                  AND CA_MAX.EFFECTIVE_DATE <= " +
            "                                         (SELECT SPD.POSTING_DATE " +
            "                                            FROM SYS_POSTING_DATE SPD " +
            "                                           WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                                        CA.INSTITUTION_NUMBER " +
            "                                                 AND SPD.STATION_NUMBER = " +
            "                                                        '129')) " +
            "                  THEN " +
            "                     'ACTIVE' " +
            "                  ELSE " +
            "                     'INACTIVE' " +
            "               END " +
            "                  ADDRESS_STATUS, " +
            "               AC.ADDRESS_CATEGORY ADDRESS_CATEGORY_TEXT, " +
            "               CA.EFFECTIVE_DATE, " +
            "               CA.CONTACT_NAME, " +
            "               CA.ADDR_LINE_1, " +
            "               CA.ADDR_LINE_2, " +
            "               CA.ADDR_LINE_3, " +
            "               CA.ADDR_LINE_4, " +
            "               CA.ADDR_LINE_5, " +
            "               CA.GROUP_NUMBER, " +
            "               CA.POST_CODE, " +
            "               CA.ADDR_CLIENT_CITY, " +
            "               CA.CLIENT_COUNTRY, " +
            "               CTRY.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT, " +
            "               CA.CLIENT_STATE, " +
            "               CA.TEL_WORK, " +
            "               CA.FAX_WORK, " +
            "               CA.EMAIL_ADDR, " +
            "               CA.DELIVERY_METHOD, " +
            "               DEL.DESCRIPTION " +
            "          FROM BW3.CIS_ADDRESSES CA " +
            "               LEFT OUTER JOIN BWT_ADDRESS_CATEGORY AC " +
            "                  ON     CA.INSTITUTION_NUMBER = AC.INSTITUTION_NUMBER " +
            "                     AND CA.ADDRESS_CATEGORY = AC.INDEX_FIELD " +
            "                     AND AC.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_COUNTRY CTRY " +
            "                  ON     CA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER " +
            "                     AND CA.CLIENT_COUNTRY = CTRY.INDEX_FIELD " +
            "                     AND CTRY.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_DELIVERY DEL " +
            "                  ON     CA.INSTITUTION_NUMBER = DEL.INSTITUTION_NUMBER " +
            "                     AND CA.DELIVERY_METHOD = DEL.INDEX_FIELD " +
            "                     AND DEL.LANGUAGE = 'USA' " +
            "         WHERE     CA.INSTITUTION_NUMBER = :institutionNumber  " +
            "               AND CA.CLIENT_NUMBER =  :internalMerchantId " +
            "               AND CA.ADDRESS_CATEGORY IN ( :addressCategory )) ";

    public static final String QUERY_GET_ACTIVE_MERCHANT_ADDRESSES = "SELECT * " +
            "  FROM (SELECT CA.ADDRESS_CATEGORY, " +
            "               NVL ( " +
            "                  TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), " +
            "                           'YYYYMMDD'), " +
            "                  '') " +
            "                  LAST_UPDATED, " +
            "               (SELECT SUI.USERNAME " +
            "                  FROM SYS_USER_INFORMATION SUI " +
            "                 WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6) " +
            "                UNION ALL " +
            "                SELECT OUP.CONTACT_NAME " +
            "                  FROM OMNI_USER_PROFILE OUP " +
            "                 WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) " +
            "                  LAST_UPDATED_BY, " +
            "               CASE " +
            "                  WHEN CA.EFFECTIVE_DATE > " +
            "                          (SELECT SPD.POSTING_DATE " +
            "                             FROM SYS_POSTING_DATE SPD " +
            "                            WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND SPD.STATION_NUMBER = '129') " +
            "                  THEN " +
            "                     'FUTURE' " +
            "                  WHEN CA.EFFECTIVE_DATE = " +
            "                          (SELECT MAX (CA_MAX.EFFECTIVE_DATE) " +
            "                             FROM CIS_ADDRESSES CA_MAX " +
            "                            WHERE     CA_MAX.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND CA_MAX.CLIENT_NUMBER = CA.CLIENT_NUMBER " +
            "                                  AND CA_MAX.ADDRESS_CATEGORY = " +
            "                                         CA.ADDRESS_CATEGORY " +
            "                                  AND CA_MAX.EFFECTIVE_DATE <= " +
            "                                         (SELECT SPD.POSTING_DATE " +
            "                                            FROM SYS_POSTING_DATE SPD " +
            "                                           WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                                        CA.INSTITUTION_NUMBER " +
            "                                                 AND SPD.STATION_NUMBER = " +
            "                                                        '129')) " +
            "                  THEN " +
            "                     'ACTIVE' " +
            "                  ELSE " +
            "                     'INACTIVE' " +
            "               END " +
            "                  ADDRESS_STATUS, " +
            "               AC.ADDRESS_CATEGORY ADDRESS_CATEGORY_TEXT, " +
            "               CA.EFFECTIVE_DATE, " +
            "               CA.CONTACT_NAME, " +
            "               CA.ADDR_LINE_1, " +
            "               CA.ADDR_LINE_2, " +
            "               CA.ADDR_LINE_3, " +
            "               CA.ADDR_LINE_4, " +
            "               CA.ADDR_LINE_5, " +
            "               CA.GROUP_NUMBER, " +
            "               CA.POST_CODE, " +
            "               CA.ADDR_CLIENT_CITY, " +
            "               CA.CLIENT_COUNTRY, " +
            "               CTRY.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT, " +
            "               CA.CLIENT_STATE, " +
            "               CA.TEL_WORK, " +
            "               CA.FAX_WORK, " +
            "               CA.EMAIL_ADDR, " +
            "               CA.DELIVERY_METHOD, " +
            "               DEL.DESCRIPTION " +
            "          FROM BW3.CIS_ADDRESSES CA " +
            "               LEFT OUTER JOIN BWT_ADDRESS_CATEGORY AC " +
            "                  ON     CA.INSTITUTION_NUMBER = AC.INSTITUTION_NUMBER " +
            "                     AND CA.ADDRESS_CATEGORY = AC.INDEX_FIELD " +
            "                     AND AC.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_COUNTRY CTRY " +
            "                  ON     CA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER " +
            "                     AND CA.CLIENT_COUNTRY = CTRY.INDEX_FIELD " +
            "                     AND CTRY.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_DELIVERY DEL " +
            "                  ON     CA.INSTITUTION_NUMBER = DEL.INSTITUTION_NUMBER " +
            "                     AND CA.DELIVERY_METHOD = DEL.INDEX_FIELD " +
            "                     AND DEL.LANGUAGE = 'USA' " +
            "         WHERE     CA.INSTITUTION_NUMBER =  :institutionNumber  " +
            "               AND CA.CLIENT_NUMBER =  :internalMerchantId " +
            "               AND CA.ADDRESS_CATEGORY IN ( :addressCategory )) " +
            " WHERE ADDRESS_STATUS = 'ACTIVE'";


    public static final String QUERY_GET_FUTURE_CLIENT_ADDRESSES = "SELECT * " +
            "  FROM (SELECT CA.ADDRESS_CATEGORY, " +
            "               NVL ( " +
            "                  TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), " +
            "                           'YYYYMMDD'), " +
            "                  '') " +
            "                  LAST_UPDATED, " +
            "               (SELECT SUI.USERNAME " +
            "                  FROM SYS_USER_INFORMATION SUI " +
            "                 WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6) " +
            "                UNION ALL " +
            "                SELECT OUP.CONTACT_NAME " +
            "                  FROM OMNI_USER_PROFILE OUP " +
            "                 WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) " +
            "                  LAST_UPDATED_BY, " +
            "               CASE " +
            "                  WHEN CA.EFFECTIVE_DATE > " +
            "                          (SELECT SPD.POSTING_DATE " +
            "                             FROM SYS_POSTING_DATE SPD " +
            "                            WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND SPD.STATION_NUMBER = '129') " +
            "                  THEN " +
            "                     'FUTURE' " +
            "                  WHEN CA.EFFECTIVE_DATE = " +
            "                          (SELECT MAX (CA_MAX.EFFECTIVE_DATE) " +
            "                             FROM CIS_ADDRESSES CA_MAX " +
            "                            WHERE     CA_MAX.INSTITUTION_NUMBER = " +
            "                                         CA.INSTITUTION_NUMBER " +
            "                                  AND CA_MAX.CLIENT_NUMBER = CA.CLIENT_NUMBER " +
            "                                  AND CA_MAX.ADDRESS_CATEGORY = " +
            "                                         CA.ADDRESS_CATEGORY " +
            "                                  AND CA_MAX.EFFECTIVE_DATE <= " +
            "                                         (SELECT SPD.POSTING_DATE " +
            "                                            FROM SYS_POSTING_DATE SPD " +
            "                                           WHERE     SPD.INSTITUTION_NUMBER = " +
            "                                                        CA.INSTITUTION_NUMBER " +
            "                                                 AND SPD.STATION_NUMBER = " +
            "                                                        '129')) " +
            "                  THEN " +
            "                     'ACTIVE' " +
            "                  ELSE " +
            "                     'INACTIVE' " +
            "               END " +
            "                  ADDRESS_STATUS, " +
            "               AC.ADDRESS_CATEGORY ADDRESS_CATEGORY_TEXT, " +
            "               CA.EFFECTIVE_DATE, " +
            "               CA.CONTACT_NAME, " +
            "               CA.ADDR_LINE_1, " +
            "               CA.ADDR_LINE_2, " +
            "               CA.ADDR_LINE_3, " +
            "               CA.ADDR_LINE_4, " +
            "               CA.ADDR_LINE_5, " +
            "               CA.GROUP_NUMBER, " +
            "               CA.POST_CODE, " +
            "               CA.ADDR_CLIENT_CITY, " +
            "               CA.CLIENT_COUNTRY, " +
            "               CTRY.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT, " +
            "               CA.CLIENT_STATE, " +
            "               CA.TEL_WORK, " +
            "               CA.FAX_WORK, " +
            "               CA.EMAIL_ADDR, " +
            "               CA.DELIVERY_METHOD, " +
            "               DEL.DESCRIPTION " +
            "          FROM BW3.CIS_ADDRESSES CA " +
            "               LEFT OUTER JOIN BWT_ADDRESS_CATEGORY AC " +
            "                  ON     CA.INSTITUTION_NUMBER = AC.INSTITUTION_NUMBER " +
            "                     AND CA.ADDRESS_CATEGORY = AC.INDEX_FIELD " +
            "                     AND AC.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_COUNTRY CTRY " +
            "                  ON     CA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER " +
            "                     AND CA.CLIENT_COUNTRY = CTRY.INDEX_FIELD " +
            "                     AND CTRY.LANGUAGE = 'USA' " +
            "               LEFT OUTER JOIN BWT_DELIVERY DEL " +
            "                  ON     CA.INSTITUTION_NUMBER = DEL.INSTITUTION_NUMBER " +
            "                     AND CA.DELIVERY_METHOD = DEL.INDEX_FIELD " +
            "                     AND DEL.LANGUAGE = 'USA' " +
            "         WHERE     CA.INSTITUTION_NUMBER = :institutionNumber  " +
            "               AND CA.CLIENT_NUMBER =  :internalMerchantId " +
            "               AND CA.ADDRESS_CATEGORY IN (:addressCategory)) " +
            " WHERE ADDRESS_STATUS = 'FUTURE'";

    public static final String GET_CLIENT_DETAILS = "SELECT CCD.CLIENT_NUMBER, CCD.SHORT_NAME,       " +
            "                                          CCL.EFFECTIVE_DATE ,       " +
            "                                          CCL.CLIENT_LEVEL,     " +
            "                                             CCD.COMPANY_NAME,       " +
            "                                             CCL.CONTRACT_REFERENCE,       " +
            "                                             CCL.PARENT_CLIENT_NUMBER,       " +
            "                                             CCD.OUR_REFERENCE,       " +
            "                                          CCL.SERVICE_CONTRACT_ID,       " +
            "                                          CCL.COST_CENTER,       " +
            "                                          CCL.CONTRACT_STATUS,       " +
            "                                          BCS2.CLIENT_STATUS CONTRACT_STATUS_TEXT,       " +
            "                                          BSCI.SERVICE_CONTRACT SERVICE_CONTRACT_ID_TEXT,       " +
            "                                             DECODE(CCD.REGISTRATION_NUMBER, NULL, '', '***' || SUBSTR(CCD.REGISTRATION_NUMBER,4)) REGISTRATION_NUMBER,       " +
            "                                             CCD.SEC_REGISTRATION_NUMBER,       " +
            "                                             CCD.VAT_REG_NUMBER,       " +
            "                                             CCD.SEC_VAT_REG_NUMBER,       " +
            "                                             CCD.LEGAL_FORM,       " +
            "                                          BLF.LEGAL_FORM LEGAL_FORM_TEXT,       " +
            "                                             CCD.CLIENT_STATUS,       " +
            "                                             BCS.CLIENT_STATUS CLIENT_STATUS_TEXT,       " +
            "                                             CCL.CLIENT_BRANCH,       " +
            "                                             BCB.CLIENT_BRANCH CLIENT_BRANCH_TEXT,       " +
            "                                             CCD.RESIDENCE_STATUS,       " +
            "                                             BRS.RESIDENCE_STATUS RESIDENCE_STATUS_TEXT,       " +
            "                                             NVL(CCD.INSTITUTION_ACCT_OFFICER,'000') INSTITUTION_ACCT_OFFICER,       " +
            "                                             BAO.ACCOUNT_OFFICER INSTITUTION_ACCT_OFFICER_TEXT,       " +
            "                                             CCD.CONTACT_NAME,       " +
            "                                             CCL.BANK_REFERENCE,       " +
            "                                             BIBC.ISO_CODE MCC,       " +
            "                                             BIBC.BUSINESS_CLASS MCC_TEXT,       " +
            "                                             CCD.RCC,       " +
            "                                             BRCC.DESCRIPTION RCC_TEXT,       " +
            "                                             CCD.ECOMMERCE_INDICATOR,       " +
            "                                             BEF.ECOMMERCE_FLAG ECOMMERCE_INDICATOR_TEXT,       " +
            "                                             CCA.MERCHANT_GRADE,       " +
            "                                             BMG.DESCRIPTION MERCHANT_GRADE_TEXT,       " +
            "                                             CCD.MERCHANT_STREET,       " +
            "                                             CCD.CLIENT_CITY,       " +
            "                                             CCD.POST_CODE,       " +
            "                                             CCD.CLIENT_COUNTRY,       " +
            "                                             BCC.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT,       " +
            "                                             BCC.CLIENT_COUNTRY CLIENT_COUNTRY_NAME,  " +
            "                                             CCD.CLIENT_STATE,       " +
            "                                             CHCS.STATE,       " +
            "                                             CCD.CLIENT_REGION,  " +
            "                                             CAPPD.APPLICATION_NUMBER,    " +
            "                                             CAPPCA.DEPARTMENT,     " +
            "                                             BR.REGION CLIENT_REGION_TEXT,       " +
            "                                             CCD.TEL_WORK,       " +
            "                                             CCD.FAX_WORK,       " +
            "                                             CCD.SERVICE_TEL_NUMBER,       " +
            "                                             CCD.CLIENT_LANGUAGE,       " +
            "                                             BCL.CLIENT_LANGUAGE CLIENT_LANGUAGE_TEXT,       " +
            "                                             CCD.TITLE,       " +
            "                                             BS.SALUTATION TITLE_TEXT,       " +
            "                                             CCD.MARITAL_STATUS CHARGEBACK_FX_PROTECTED,       " +
            "                                             BC.CONFIRMATION CHARGEBACK_FX_PROTECTED_TEXT,       " +
            "                                             CCL.PROVIDER_ACCT_OFFICER PAYMENT_METHOD,       " +
            "                                             BAO2.ACCOUNT_OFFICER PAYMENT_METHOD_TEXT,       " +
            "                                             CCD.BILLBACK_INDICATOR,       " +
            "                                             BBI.BILLBACK_INDICATOR BILLBACK_INDICATOR_TEXT,       " +
            "                                             CCD.CROSS_BORDER_FEE_IND,       " +
            "                                             OCBF.LONG_TEXT CROSS_BORDER_FEE_IND_TEXT,       " +
            "                                             CCD.MC_IP_QUALIFICATION,       " +
            "                                             BIQM.IP_QUALIFICATION MC_IP_QUALIFICATION_TEXT,       " +
            "                                             CCD.MC_IP_VALUE,       " +
            "                                             CCD.VISA_IP_QUALIFICATION,       " +
            "                                             BIQV.IP_QUALIFICATION VISA_IP_QUALIFICATION_TEXT,       " +
            "                                             CCD.VISA_IP_VALUE,       " +
            "                                             CCA.PAGO_IP_QUALIFICATION,       " +
            "                                             BIQP.IP_QUALIFICATION PAGO_IP_QUALIFICATION_TEXT,       " +
            "                                             CCA.LOW_VALUE_PAYMENTS,       " +
            "                                             BCLV.CONFIRMATION LOW_VALUE_PAYMENTS_TEXT,       " +
            "                                             CCA.VISA_LAC_FEE_IND,       " +
            "                                             BVLF.VISA_LAC_FEES VISA_LAC_FEE_IND_TEXT,       " +
            "                                             CCA.MC_LAC_FEE_IND,       " +
            "                                             BMLF.MC_LAC_FEES MC_LAC_FEE_IND_TEXT,       " +
            "                                             CCA.VISA_EU_FEE_IND,       " +
            "                                             BVEF.VISA_EU_FEE VISA_EU_FEE_IND_TEXT,       " +
            "                                             CCA.MC_EU_FEE_IND,       " +
            "                                             BC_MEFI.CONFIRMATION MC_EU_FEE_IND_TEXT,       " +
            "                                             CCA.MC_US_ABVF_IND,       " +
            "                                             OCMF.MC_PIF_FEE_IND,       " +
            "                                             CCA.B2B_FEE_IND,       " +
            "                                             DECODE(CCA.B2B_FEE_IND,'000','N/A',B2B.CROSS_BORDER_FEE ) B2B_FEE_IND_TEXT,       " +
            "                                             CCA.DYNAMIC_PRICING_INDICATOR,       " +
            "                                             BC_DYNAMIC.CONFIRMATION DYNAMIC_PRICING_INDICATOR_TEXT,       " +
            "                                             CCA.VISA_IASF_IND,       " +
            "                                             BC_IASF.CONFIRMATION VISA_IASF_IND_TEXT,       " +
            "                                             CCA.VISA_SMI,       " +
            "                                             CCA.VISA_US_AP_IAF_IND,       " +
            "                                             BVIF.VISA_IA_FEE VISA_US_AP_IAF_IND_TEXT,       " +
            "                                             CCA.VISA_PF_ID,       " +
            "                                             CCA.PAYMENT_ADVICE_GENERATION,       " +
            "                                             BPAG.ADVICE_GENERATION PAYMENT_ADVICE_GENERATION_TEXT,       " +
            "                                             CCA.PAYMENT_DELIVERY_METHOD,       " +
            "                                             BPM.delivery_method PAYMENT_DELIVERY_METHOD_TEXT,       " +
            "                                             CCA.PAYMENT_FACILITATOR_ID,       " +
            "                                             CCA.INDEPENDENT_SALES_ORG_ID,       " +
            "                                             CCA.MUNICIPAL_CODE,       " +
            "                                             BMC.MUNICIPALITY MUNICIPAL_CODE_TEXT,       " +
            "                                             CCA.MUNICIPAL_TAX_IND,       " +
            "                                             BC_MUNICIPAL.CONFIRMATION MUNICIPAL_TAX_IND_TEXT,       " +
            "                                             BACS_INCOME_TAX.INDEX_FIELD INCOME_TAX_IND,       " +
            "                                             BACS_INCOME_TAX.CONDITION_SET INCOME_TAX_IND_TEXT,       " +
            "                                                   CCA2.ACCT_CREATION_SYS_DATE,       " +
            "                                                   CCA2.ACCT_APPROVAL_DATE,       " +
            "                                                   CCA2.ACCT_SIGNED_DATE,       " +
            "                                                   CCA2.SALES_AGENT_CODE,       " +
            "                                                   CCA2.BUSINESS_OWNER,       " +
            "                                                   CCA2.SALES_CHANNEL,       " +
            "                                                   SC.SALES_CHANNEL SALES_CHANNEL_TEXT,       " +
            "                                                   CURR1.SWIFT_CODE SALES_CURRENCY,       " +
            "                                                   CCA2.SIGNED_SALES_VOL,       " +
            "                                                   CCA2.SIGNED_AVRG_TICKET_VALUE,       " +
            "                                                   CCA2.SALES_LEAD,       " +
            "                                                   CCA2.SIGNED_SALES_NUM,       " +
            "                                             CCA2.PRIORITY_MEMO,       " +
            "                                             BACS_VAT_TAX.INDEX_FIELD VAT_TAX_IND,       " +
            "                                             BACS_VAT_TAX.CONDITION_SET VAT_TAX_IND_TEXT,       " +
            "                                             BACS.INDEX_FIELD CLIENT_TARIFF,       " +
            "                                             BACS.CONDITION_SET CLIENT_TARIFF_TEXT,       " +
            "                                             BPT.INDEX_FIELD POSTING_TARIFF,       " +
            "                                             BPT.POSTING_METHOD POSTING_TARIFF_TEXT,       " +
            "                                             BSM.INDEX_FIELD SETTLEMENT_METHOD,       " +
            "                                             BSM.SETTLEMENT_METHOD SETTLEMENT_METHOD_TEXT,       " +
            "                                             BTG.INDEX_FIELD TIER_GROUP,       " +
            "                                             NVL (TO_CHAR (TO_DATE (SUBSTR (CCD.AUDIT_TRAIL, 0, 5), 'YYDDD'), 'YYYYMMDD'),'') LAST_UPDATED,     " +
            "                                        (SELECT SUI.USERNAME     " +
            "                                           FROM SYS_USER_INFORMATION SUI     " +
            "                                          WHERE SUI.USERID = SUBSTR (CCD.AUDIT_TRAIL, 14, 6)     " +
            "                                         UNION ALL     " +
            "                                         SELECT OUP.CONTACT_NAME     " +
            "                                           FROM OMNI_USER_PROFILE OUP     " +
            "                                          WHERE OUP.SEQUENCE_NO = SUBSTR (CCD.AUDIT_TRAIL, 14, 6)) LAST_UPDATED_BY,        " +
            "                                             BTG.TIER_GROUP TIER_GROUP_TEXT,       " +
            "                                             (SELECT DISTINCT BC.SWIFT_CODE       " +
            "                                           FROM CBR_MERCHANT_FLOORLIMIT  CMF       " +
            "                                           INNER JOIN BWT_CURRENCY BC ON CMF.INSTITUTION_NUMBER = BC.INSTITUTION_NUMBER       " +
            "                                                                       AND CMF.LIMIT_CURRENCY = BC.ISO_CODE       " +
            "                                                                       AND BC.LANGUAGE = 'USA'       " +
            "                                           WHERE CMF.INSTITUTION_NUMBER = CCD.INSTITUTION_NUMBER       " +
            "                                             AND CMF.CLIENT_NUMBER = CCD.CLIENT_NUMBER ) LIMIT_CURRENCY       " +
            "                                    FROM CIS_CLIENT_DETAILS CCD       " +
            "                                    INNER JOIN CIS_CLIENT_LINKS CCL ON CCD.INSTITUTION_NUMBER =  CCL.INSTITUTION_NUMBER       " +
            "                                                                                     AND CCD.CLIENT_NUMBER = CCL.CLIENT_NUMBER       " +
            "                                                                                     AND CCL.EFFECTIVE_DATE IN ( SELECT MAX( CCL_MAX.EFFECTIVE_DATE)       " +
            "                                                                                                                               FROM CIS_CLIENT_LINKS CCL_MAX       " +
            "                                                                                                                               WHERE CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER       " +
            "                                                                                                                                 AND CCL_MAX.INSTITUTION_NUMBER =  CCL.INSTITUTION_NUMBER       " +
            "                                                                                                                                 AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER       " +
            "                                                                                                                                 AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID       " +
            "                                                                                                                                 AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL       " +
            "                                                                                                                                 AND CCL_MAX.EXPIRY_DATE >= TO_CHAR( SYSDATE,'yyyyMMdd'))       " +
            "                                                                            AND CCL.CLIENT_LEVEL IN (  SELECT MAX( CCLM.CLIENT_LEVEL)       " +
            "                                                                                               FROM CIS_CLIENT_LINKS CCLM       " +
            "                                                                                               WHERE CCLM.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER       " +
            "                                                                                                 AND CCLM.CLIENT_NUMBER = CCL.CLIENT_NUMBER       " +
            "                                                                                                 AND CCLM.EFFECTIVE_DATE = CCL.EFFECTIVE_DATE)       " +
            "                                    LEFT OUTER JOIN CIS_CLIENT_ADDENDUM CCA ON CCD.INSTITUTION_NUMBER =  CCA.INSTITUTION_NUMBER       " +
            "                                                                                                AND CCD.CLIENT_NUMBER = CCA.CLIENT_NUMBER       " +
            "                                    LEFT OUTER JOIN CIS_CONTRACT_ADDENDUM CCA2 ON CCD.INSTITUTION_NUMBER =  CCA2.INSTITUTION_NUMBER       " +
            "                                                                                                AND CCD.CLIENT_NUMBER = CCA2.CLIENT_NUMBER       " +
            "                                    LEFT OUTER JOIN BWT_SALES_CHANNEL SC ON CCA2.SALES_CHANNEL = SC.INDEX_FIELD       " +
            "                                                                                                  AND CCD.INSTITUTION_NUMBER = SC.INSTITUTION_NUMBER       " +
            "                                                                                                  AND SC.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN CHT_COUNTRY_STATE CHCS ON CCD.CLIENT_STATE = CHCS.STATE_CODE       " +
            "                                                                                                  AND CCD.INSTITUTION_NUMBER = CHCS.INSTITUTION_NUMBER       " +
            "                                                                                                  AND SC.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CURRENCY CURR1 ON CCA2.SALES_CURRENCY = CURR1.ISO_CODE       " +
            "                                                                                                  AND CCD.INSTITUTION_NUMBER = CURR1.INSTITUTION_NUMBER       " +
            "                                                                                                  AND CURR1.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN OMNI_CLIENT_MISC_FEES OCMF ON CCD.INSTITUTION_NUMBER =  OCMF.INSTITUTION_NUMBER       " +
            "                                                                                                   AND CCD.CLIENT_NUMBER = OCMF.CLIENT_NUMBER       " +
            "                                    LEFT OUTER JOIN BWT_LEGAL_FORM BLF ON CCD.LEGAL_FORM = BLF.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BLF.INSTITUTION_NUMBER       " +
            "                                                                                       AND BLF.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_MUNICIPAL_CODE BMC ON CCA.MUNICIPAL_CODE = BMC.INDEX_FIELD       " +
            "                                                                                       AND CCA.INSTITUTION_NUMBER =  BMC.INSTITUTION_NUMBER       " +
            "                                                                                       AND BMC.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_SERVICE_CONTRACT_ID BSCI ON CCL.SERVICE_CONTRACT_ID = BSCI.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BSCI.INSTITUTION_NUMBER       " +
            "                                                                                       AND BSCI.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_TIER_GROUP BTG ON NVL(CCL.TIER_GROUP,'000') = BTG.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BTG.INSTITUTION_NUMBER       " +
            "                                                                                       AND BTG.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_SETTLEMENT_METHOD BSM ON CCL.SETTLEMENT_METHOD = BSM.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BSM.INSTITUTION_NUMBER       " +
            "                                                                                       AND BSM.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_ACCOUNT_CONDITION_SET BACS ON CCL.CLIENT_TARIFF = BACS.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BACS.INSTITUTION_NUMBER       " +
            "                                                                                       AND BACS.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_ACCOUNT_CONDITION_SET BACS_INCOME_TAX ON CCA.INCOME_TAX_IND = BACS_INCOME_TAX.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BACS_INCOME_TAX.INSTITUTION_NUMBER       " +
            "                                                                                       AND BACS_INCOME_TAX.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_ACCOUNT_CONDITION_SET BACS_VAT_TAX ON CCA.VAT_TAX_IND = BACS_VAT_TAX.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BACS_VAT_TAX.INSTITUTION_NUMBER       " +
            "                                                                                       AND BACS_VAT_TAX.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_POSTING_TARIFF BPT ON CCL.POSTING_METHOD = BPT.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BPT.INSTITUTION_NUMBER       " +
            "                                                                                       AND BPT.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CLIENT_STATUS BCS ON CCD.CLIENT_STATUS = BCS.INDEX_FIELD       " +
            "                                                                                            AND CCD.INSTITUTION_NUMBER =  BCS.INSTITUTION_NUMBER       " +
            "                                                                                            AND BCS.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CLIENT_STATUS BCS2 ON CCL.CONTRACT_STATUS = BCS2.INDEX_FIELD       " +
            "                                                                                            AND CCD.INSTITUTION_NUMBER =  BCS2.INSTITUTION_NUMBER       " +
            "                                                                                            AND BCS2.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CLIENT_BRANCH BCB ON CCL.CLIENT_BRANCH = BCB.INDEX_FIELD       " +
            "                                                                                            AND CCD.INSTITUTION_NUMBER =  BCB.INSTITUTION_NUMBER       " +
            "                                                                                            AND BCB.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_RESIDENCE_STATUS BRS ON CCD.RESIDENCE_STATUS = BRS.INDEX_FIELD       " +
            "                                                                                            AND CCD.INSTITUTION_NUMBER =  BRS.INSTITUTION_NUMBER       " +
            "                                                                                            AND BRS.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_ACCOUNT_OFFICER BAO ON NVL(CCD.INSTITUTION_ACCT_OFFICER,'000')  = BAO.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  BAO.INSTITUTION_NUMBER       " +
            "                                                                                              AND BAO.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_ISO_BUSS_CLASS BIBC ON CCD.BUSINESS_CLASS  = BIBC.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  BIBC.INSTITUTION_NUMBER       " +
            "                                                                                              AND BIBC.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_RETAILER_CATEGORY_CODE BRCC ON CCD.RCC  = BRCC.INDEX_FIELD       " +
            "                                                                                                      AND CCD.INSTITUTION_NUMBER =  BRCC.INSTITUTION_NUMBER       " +
            "                                                                                                      AND BRCC.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_ECOMMERCE_FLAG BEF ON CCD.ECOMMERCE_INDICATOR  = BEF.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BEF.INSTITUTION_NUMBER       " +
            "                                                                                             AND BEF.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_COUNTRY BCC ON CCD.CLIENT_COUNTRY  = BCC.INDEX_FIELD       " +
            "                                                                                     AND CCD.INSTITUTION_NUMBER =  BCC.INSTITUTION_NUMBER       " +
            "                                                                                     AND BCC.LANGUAGE = 'USA'          " +
            "                                    LEFT OUTER JOIN BWT_MERCHANT_GRADE BMG ON CCA.MERCHANT_GRADE  = BMG.INDEX_FIELD       " +
            "                                                                                AND CCA.INSTITUTION_NUMBER =  BMG.INSTITUTION_NUMBER       " +
            "                                                                                AND BMG.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CLIENT_LANGUAGE BCL ON CCD.CLIENT_LANGUAGE  = BCL.INDEX_FIELD       " +
            "                                                                                                AND CCD.INSTITUTION_NUMBER =  BCL.INSTITUTION_NUMBER       " +
            "                                                                                                AND BCL.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_SALUTATION BS ON CCD.TITLE  = BS.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BS.INSTITUTION_NUMBER       " +
            "                                                                                       AND BS.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CONFIRMATION BC ON CCD.MARITAL_STATUS  = BC.INDEX_FIELD       " +
            "                                                                                       AND CCD.INSTITUTION_NUMBER =  BC.INSTITUTION_NUMBER       " +
            "                                                                                       AND BC.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_ACCOUNT_OFFICER BAO2 ON CCL.PROVIDER_ACCT_OFFICER  = BAO2.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  BAO2.INSTITUTION_NUMBER       " +
            "                                                                                              AND BAO2.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_BILLBACK_INDICATOR BBI ON CCD.BILLBACK_INDICATOR  = BBI.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  BBI.INSTITUTION_NUMBER       " +
            "                                                                                              AND BBI.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN OCHT_CROSS_BORDER_FEE OCBF ON CCD.CROSS_BORDER_FEE_IND  = OCBF.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  OCBF.INSTITUTION_NUMBER       " +
            "                                                                                              AND OCBF.LANGUAGE = 'USA'        " +
            "                                    LEFT OUTER JOIN BWT_IP_QUALIFICATION BIQM ON CCD.MC_IP_QUALIFICATION  = BIQM.INDEX_FIELD        " +
            "                                                                                                 AND CCD.INSTITUTION_NUMBER =  BIQM.INSTITUTION_NUMBER       " +
            "                                                                                                 AND BIQM.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_IP_QUALIFICATION BIQV ON CCD.VISA_IP_QUALIFICATION  = BIQV.INDEX_FIELD       " +
            "                                                                                                 AND CCD.INSTITUTION_NUMBER =  BIQV.INSTITUTION_NUMBER       " +
            "                                                                                                 AND BIQV.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_IP_QUALIFICATION BIQP ON CCA.PAGO_IP_QUALIFICATION  = BIQP.INDEX_FIELD       " +
            "                                                                                                 AND CCD.INSTITUTION_NUMBER =  BIQP.INSTITUTION_NUMBER       " +
            "                                                                                                 AND BIQP.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CONFIRMATION BCLV ON CCA.LOW_VALUE_PAYMENTS  = BCLV.INDEX_FIELD       " +
            "                                                                                            AND CCD.INSTITUTION_NUMBER =  BCLV.INSTITUTION_NUMBER       " +
            "                                                                                          AND BCLV.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_VISA_LAC_FEES BVLF ON CCA.VISA_LAC_FEE_IND  = BVLF.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BVLF.INSTITUTION_NUMBER       " +
            "                                                                                           AND BVLF.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_MC_LAC_FEES BMLF ON CCA.MC_LAC_FEE_IND  = BMLF.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BMLF.INSTITUTION_NUMBER       " +
            "                                                                                           AND BMLF.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_VISA_EU_FEE BVEF ON CCA.VISA_EU_FEE_IND  = BVEF.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BVEF.INSTITUTION_NUMBER       " +
            "                                                                                           AND BVEF.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CONFIRMATION BC_MEFI ON CCA.MC_EU_FEE_IND  = BC_MEFI.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BC_MEFI.INSTITUTION_NUMBER       " +
            "                                                                                           AND BC_MEFI.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CROSS_BORDER_FEE B2B ON CCA.B2B_FEE_IND  = B2B.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  B2B.INSTITUTION_NUMBER       " +
            "                                                                                              AND B2B.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_PAYMENT_ADVICE_GENERATION BPAG ON CCA.PAYMENT_ADVICE_GENERATION  = BPAG.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  BPAG.INSTITUTION_NUMBER       " +
            "                                                                                              AND BPAG.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_PAYMENT_DELIVERY_METHOD BPM ON CCA.PAYMENT_DELIVERY_METHOD  = BPM.INDEX_FIELD       " +
            "                                                                                              AND CCD.INSTITUTION_NUMBER =  BPM.INSTITUTION_NUMBER       " +
            "                                                                                              AND BPM.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CONFIRMATION BC_DYNAMIC ON CCA.DYNAMIC_PRICING_INDICATOR  = BC_DYNAMIC.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BC_DYNAMIC.INSTITUTION_NUMBER       " +
            "                                                                                           AND BC_DYNAMIC.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_CONFIRMATION BC_IASF ON CCA.VISA_IASF_IND  = BC_IASF.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BC_IASF.INSTITUTION_NUMBER       " +
            "                                                                                           AND BC_IASF.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN BWT_VISA_IA_FEES BVIF ON CCA.VISA_US_AP_IAF_IND  = BVIF.INDEX_FIELD       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  BVIF.INSTITUTION_NUMBER       " +
            "                                                                                           AND BVIF.LANGUAGE = 'USA'       " +
            "                                    LEFT OUTER JOIN CIS_APPLICATION_DETAIL CAPPD ON CCD.CLIENT_NUMBER  = CAPPD.CLIENT_NUMBER       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  CAPPD.INSTITUTION_NUMBER   " +
            "                                    LEFT OUTER JOIN CIS_APPL_CLIENT_ADDENDUM CAPPCA ON CAPPD.APPLICATION_NUMBER = CAPPCA.APPLICATION_NUMBER       " +
            "                                                                                             AND CCD.INSTITUTION_NUMBER =  CAPPCA.INSTITUTION_NUMBER     " +
            "                                    LEFT OUTER JOIN BWT_REGION BR ON CAPPCA.DEPARTMENT = BR.INDEX_FIELD       " +
            "                                                                                AND CCD.INSTITUTION_NUMBER =  BR.INSTITUTION_NUMBER       " +
            "                                                                                AND BR.LANGUAGE = 'USA'    " +
            "                                    LEFT OUTER JOIN BWT_CONFIRMATION BC_MUNICIPAL ON CCA.MUNICIPAL_TAX_IND  = BC_MUNICIPAL.INDEX_FIELD       " +
            "                                                                                                        AND CCD.INSTITUTION_NUMBER =  BC_MUNICIPAL.INSTITUTION_NUMBER       " +
            "                                                                                                        AND BC_MUNICIPAL.LANGUAGE = 'USA'       " +
            "            WHERE CCD.INSTITUTION_NUMBER = :institutionNumber " +
            "              AND CCD.CLIENT_NUMBER = :clientNumber  ";
          
    
    
    public static final String GET_EFFECTIVE_CLIENT_ADDRESSES = "SELECT CA.ADDRESS_CATEGORY,"
            + "       NVL (TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), 'YYYYMMDD'),'') LAST_UPDATED,"
            + "       (SELECT SUI.USERNAME"
            + "          FROM SYS_USER_INFORMATION SUI"
            + "         WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6)"
            + "        UNION ALL"
            + "        SELECT OUP.CONTACT_NAME"
            + "          FROM OMNI_USER_PROFILE OUP"
            + "         WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) LAST_UPDATED_BY,"
            + "       AC.ADDRESS_CATEGORY ADDRESS_CATEGORY_TEXT,"
            + "       CA.EFFECTIVE_DATE,"
            + "       CA.CONTACT_NAME,"
            + "       CA.ADDR_LINE_1,"
            + "       CA.ADDR_LINE_2,"
            + "       CA.ADDR_LINE_3,"
            + "       CA.ADDR_LINE_4,"
            + "       CA.ADDR_LINE_5,"
            + "       CA.GROUP_NUMBER,"
            + "       CA.POST_CODE,"
            + "       CA.ADDR_CLIENT_CITY,"
            + "       CA.CLIENT_COUNTRY,"
            + "       CTRY.COUNTRY_CODE_3 CLIENT_COUNTRY_TEXT,"
            + "       CA.CLIENT_STATE,"
            + "       CA.TEL_WORK,"
            + "       CA.FAX_WORK,"
            + "       CA.EMAIL_ADDR,"
            + "       CA.DELIVERY_METHOD,"
            + "       DEL.DESCRIPTION"
            + "  FROM BW3.CIS_ADDRESSES CA"
            + "       LEFT OUTER JOIN BWT_ADDRESS_CATEGORY AC"
            + "          ON     CA.INSTITUTION_NUMBER = AC.INSTITUTION_NUMBER"
            + "             AND CA.ADDRESS_CATEGORY = AC.INDEX_FIELD"
            + "             AND AC.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_COUNTRY CTRY"
            + "          ON     CA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER"
            + "             AND CA.CLIENT_COUNTRY = CTRY.INDEX_FIELD"
            + "             AND CTRY.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_DELIVERY DEL"
            + "          ON     CA.INSTITUTION_NUMBER = DEL.INSTITUTION_NUMBER"
            + "             AND CA.DELIVERY_METHOD = DEL.INDEX_FIELD"
            + "             AND DEL.LANGUAGE = 'USA'"
            + " WHERE     CA.INSTITUTION_NUMBER = :institutionNumber"
            + "       AND CA.CLIENT_NUMBER = :clientNumber"
            + "       AND CA.EFFECTIVE_DATE <= :effectiveDate"
            + "       AND NVL (CA.EXPIRY_DATE, '99991232') >= :effectiveDate"
            + "       AND CA.EFFECTIVE_DATE IN"
            + "              (SELECT MAX (CA_MAX.EFFECTIVE_DATE)"
            + "                 FROM BW3.CIS_ADDRESSES CA_MAX"
            + "                WHERE     CA_MAX.CLIENT_NUMBER = CA.CLIENT_NUMBER"
            + "                      AND CA_MAX.INSTITUTION_NUMBER = CA.INSTITUTION_NUMBER"
            + "                      AND CA_MAX.ADDRESS_CATEGORY = CA.ADDRESS_CATEGORY"
            + "                      AND CA_MAX.EFFECTIVE_DATE <= :effectiveDate"
            + "                      AND NVL (CA_MAX.EXPIRY_DATE, 'yyyyMMdd') >= :effectiveDate"
            + "                      AND CA_MAX.GROUP_NUMBER = CA.GROUP_NUMBER)";


    public static final String GET_METCHANT_FX_RATE_MARGINS_ACTIVE = "SELECT 'ACTIVE' STATUS,"
            + "       NVL (TO_CHAR (TO_DATE (SUBSTR (CFXM.AUDIT_TRAIL, 0, 5), 'YYDDD'),'YYYYMMDD'),'') LAST_UPDATED,"
            + "       (SELECT SUI.USERNAME"
            + "          FROM SYS_USER_INFORMATION SUI"
            + "         WHERE USERID = SUBSTR (CFXM.AUDIT_TRAIL, 14, 6)"
            + "        UNION ALL"
            + "        SELECT OUP.CONTACT_NAME"
            + "          FROM OMNI_USER_PROFILE OUP"
            + "         WHERE OUP.SEQUENCE_NO = SUBSTR (CFXM.AUDIT_TRAIL, 14, 6))"
            + "          LAST_UPDATED_BY,"
            + "       CFXM.CURRENCY,"
            + "       CURR.SWIFT_CODE,"
            + "       CFXM.EFFECTIVE_DATE,"
            + "       CFXM.PROCESS_ID,"
            + "       PID.PROCESS_ID PROCESS_ID_TEXT,"
            + "       CFXM.GROUP_NUMBER,"
            + "       CFXM.MARGIN_PERCENT"
            + "  FROM CIS_CLIENT_FX_MARGINS CFXM"
            + "       LEFT OUTER JOIN BWT_CURRENCY CURR"
            + "          ON     CFXM.INSTITUTION_NUMBER = CURR.INSTITUTION_NUMBER"
            + "             AND CFXM.CURRENCY = CURR.ISO_CODE"
            + "             AND CURR.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_PROCESS_ID PID"
            + "          ON     CFXM.INSTITUTION_NUMBER = PID.INSTITUTION_NUMBER"
            + "             AND CFXM.PROCESS_ID = PID.INDEX_FIELD"
            + "             AND PID.LANGUAGE = 'USA'"
            + " WHERE     CFXM.INSTITUTION_NUMBER = :instituionNumber"
            + "       AND CFXM.CLIENT_NUMBER = :clientNumber"
            + "       AND CFXM.EFFECTIVE_DATE <="
            + "              (SELECT SPD.POSTING_DATE"
            + "                 FROM SYS_POSTING_DATE SPD"
            + "                WHERE     SPD.INSTITUTION_NUMBER = CFXM.INSTITUTION_NUMBER"
            + "                      AND SPD.STATION_NUMBER = '129')"
            + "       AND CFXM.EFFECTIVE_DATE IN"
            + "              (SELECT MAX (CFXM_MAX.EFFECTIVE_DATE)"
            + "                 FROM CIS_CLIENT_FX_MARGINS CFXM_MAX"
            + "                WHERE     CFXM_MAX.CLIENT_NUMBER = CFXM.CLIENT_NUMBER"
            + "                      AND CFXM_MAX.GROUP_NUMBER = CFXM.GROUP_NUMBER"
            + "                      AND CFXM_MAX.CLEARING_CHANNEL = CFXM.CLEARING_CHANNEL"
            + "                      AND CFXM_MAX.INSTITUTION_NUMBER ="
            + "                             CFXM.INSTITUTION_NUMBER"
            + "                      AND CFXM_MAX.PROCESS_ID = CFXM.PROCESS_ID"
            + "                      AND CFXM_MAX.CURRENCY = CFXM.CURRENCY"
            + "                      AND CFXM_MAX.EFFECTIVE_DATE <="
            + "                             (SELECT SPD.POSTING_DATE"
            + "                                FROM SYS_POSTING_DATE SPD"
            + "                               WHERE     SPD.INSTITUTION_NUMBER ="
            + "                                            CFXM_MAX.INSTITUTION_NUMBER"
            + "                                     AND SPD.STATION_NUMBER = '129'))";

    public static final String GET_SALES_INFORMATION = "SELECT CA.CLIENT_NUMBER,"
            + "       CA.ACCT_APPROVAL_DATE,"
            + "       CA.ACCT_CREATION_SYS_DATE,"
            + "       CA.ACCT_SIGNED_DATE,"
            + "       CA.BUSINESS_OWNER,"
            + "       CA.GROUP_NUMBER,"
            + "       CA.LOCKING_COUNTER,"
            + "       CA.PRIORITY_MEMO,"
            + "       CA.RECORD_DATE,"
            + "       CA.SALES_AGENT_CODE,"
            + "       CA.SALES_CHANNEL,"
            + "       SC.SALES_CHANNEL SALES_CHANNEL_TEXT,"
            + "       CURR.SWIFT_CODE SALES_CURRENCY,"
            + "       CURR.NAME,"
            + "       CA.SALES_LEAD,"
            + "       CA.SIGNED_AVRG_TICKET_VALUE,"
            + "       CA.SIGNED_SALES_NUM,"
            + "       CA.SIGNED_SALES_VOL"
            + "  FROM CIS_CONTRACT_ADDENDUM CA"
            + "       LEFT OUTER JOIN BWT_CURRENCY CURR"
            + "          ON     CA.SALES_CURRENCY = CURR.ISO_CODE"
            + "             AND CA.INSTITUTION_NUMBER = CURR.INSTITUTION_NUMBER"
            + "             AND CURR.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_SALES_CHANNEL SC"
            + "          ON     CA.SALES_CHANNEL = SC.INDEX_FIELD"
            + "             AND CA.INSTITUTION_NUMBER = SC.INSTITUTION_NUMBER"
            + "             AND SC.LANGUAGE = 'USA'"
            + " WHERE     CA.INSTITUTION_NUMBER = :instituionNumber"
            + "       AND CA.CLIENT_NUMBER = :clientNumber";

    public static final String QUERY_VALIDATE_IF_MEMBER_LEVEL_MERCHANT ="SELECT  CCL.SERVICE_CONTRACT_ID, CCL.CLIENT_LEVEL, CCL.CONTRACT_STATUS " +
                                                                        "FROM CIS_CLIENT_LINKS CCL " +
                                                                        "WHERE CCL.INSTITUTION_NUMBER = :institutionNumber " +
                                                                        "  AND CCL.CLIENT_NUMBER = :internalMerchantId " +
                                                                        "  AND CCL.EFFECTIVE_DATE IN (  SELECT MAX(CCL_MAX.EFFECTIVE_DATE) " +
                                                                        "			  					FROM CIS_CLIENT_LINKS CCL_MAX " +
                                                                        "			  					WHERE CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
                                                                        "			  					  AND CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
                                                                        "			  					  AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER " +
                                                                        "			  					  AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID " +
                                                                        "			  					  AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL " +
                                                                        "			  					  AND CCL_MAX.EXPIRY_DATE >= (SELECT SPD.POSTING_DATE " +
                                                                        "			  					  							  FROM SYS_POSTING_DATE SPD " +
                                                                        "			  					  							  WHERE SPD.INSTITUTION_NUMBER = CCL_MAX.INSTITUTION_NUMBER " +
                                                                        "			  					  							    AND SPD.STATION_NUMBER = '129')) " +
                                                                        "ORDER BY 2 DESC ";

    public static final String GET_MERCHANT_ACCOUNTS = "SELECT CCA.ACCOUNT_TYPE_ID,"
            + "       ATID.TYPE_ID ACCOUNT_TYPE_ID_TEXT,"
            + "       CCA.ACCT_CURRENCY,"
            + "       CURR.SWIFT_CODE ACCT_CURRENCY_TEXT,"
            + "       CCA.ACCT_NUMBER,"
            + "       CCA.INSTITUTION_NUMBER,"
            + "       CCA.RECORD_DATE,"
            + "       CCA.ACCT_STATUS,"
            + "       ASS.STATUS ACCT_STATUS_TEXT,"
            + "       CCA.BILLING_LEVEL,"
            + "       CASE WHEN CCA.BILLING_LEVEL = '000' THEN 'False' ELSE 'True' END"
            + "          BILLING_LEVEL_TEXT,"
            + "       CCA.SETTLEMENT_NUMBER,"
            + "       CSI.RECEIVER_COUNTRY_CODE,"
            + "       CTRY.COUNTRY_CODE_3,"
            + "       CSI.PAYMENT_REFERENCE,"
            + "       CSI.CONTING_LIAB_ACCOUNT,"
            + "       CCA.STATEMENT_GENERATION,"
            + "       SG.STATEMENT_GENERATION STATEMENT_GENERATION_TEXT,"
            + "       CCA.STATEMENT_TYPE,"
            + "       ST.STATEMENT_TYPE STATEMENT_TYPE_TEXT,"
            + "       NVL (CSI.CALENDAR_TYPE,'000') CALENDAR_TYPE,"
            + "       NVL (CT.CALENDAR_TYPE, 'N/A') CALENDAR_TYPE_TEXT,"
            + "       CSI.COUNTER_BANK_NAME,"
            + "       CSI.COUNTER_BANK_CITY,"
            + "       CSI.COUNTER_BANK_ACCOUNT_NAME,"
            + "       CSI.COUNTER_BANK_NUMBER,"
            + "       CSI.SEC_COUNTER_BANK_ACCOUNT,"
            + "       CSI.COUNTER_BANK_ACCOUNT,"
            + "       CSI.IBAN_REFERENCE,"
            + "       CSI.SEC_IBAN_REFERENCE,"
            + "       CSI.FUNDING_NARRATIVE,"
            + "       CSI.BANK_TEL_NUMBER,"
            + "       CSI.BANK_CONTACT_NAME,"
            + "       CSI.CORRESP_BANK_NUMBER,"
            + "       CSI.CORRESP_BANK_ACCOUNT,"
            + "       CSI.CALENDAR_DAYS,"
            + "       CSI.REUTERS_CODE,"
            + "       CSI.PAYMENT_METHOD,"
            + "       PM.PAYMENT_METHOD PAYMENT_METHOD_TEXT,"
            + "       CSI.CLEARING_ENTITY,"
            + "       CE.CLEARING_ENTITY CLEARING_ENTITY_TEXT,"
            + "       CSI.COUNTER_BANK_NAME_DR,"
            + "       CSI.COUNTER_BANK_CITY_DR,"
            + "       CSI.COUNTER_BANK_ACCOUNT_NAME_DR,"
            + "       CSI.COUNTER_BANK_NUMBER_DR,"
            + "       CSI.COUNTER_BANK_ACCOUNT_DR,"
            + "       CSI.SEC_COUNTER_BANK_ACCOUNT_DR,"
            + "       CSI.IBAN_REFERENCE_DR,"
            + "       CSI.SEC_IBAN_REFERENCE_DR,"
            + "       CSI.FUNDING_NARRATIVE_DR,"
            + "       CSI.BANK_TEL_NUMBER_DR,"
            + "       CSI.BANK_CONTACT_NAME_DR,"
            + "       CSI.CORRESP_BANK_NUMBER_DR,"
            + "       CSI.CORRESP_BANK_ACCOUNT_DR,"
            + "       CSI.CALENDAR_DAYS_DR,"
            + "       CSI.REUTERS_CODE_DR,"
            + "       CCA.PARENT_CLIENT_NUMBER,"
            + "       CCD.TRADE_NAME,"
            + "       CSI.PAYMENT_METHOD_DR,"
            + "       CCL.CONTRACT_STATUS,"
            + "       BCS1.CLIENT_STATUS CONTRACT_STATUS_TEXT,"
            + "       PM1.PAYMENT_METHOD PAYMENT_METHOD_DR_TEXT,"
            + "       CSI.CLEARING_ENTITY_DR,"
            + "       CE1.CLEARING_ENTITY CLEARING_ENTITY_DR_TEXT,"
            + "       NVL (OSMI.FIRST_DEBIT_DATE, '000') FIRST_DEBIT_DATE"
            + "  FROM CAS_CLIENT_ACCOUNT CCA"
            + "       INNER JOIN CIS_CLIENT_LINKS CCL"
            + "          ON     CCA.CLIENT_NUMBER = CCL.CLIENT_NUMBER"
            + "             AND CCA.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER"
            + "             AND CCL.EFFECTIVE_DATE IN"
            + "                    (SELECT MAX (CCL_MAX.EFFECTIVE_DATE)"
            + "                       FROM CIS_CLIENT_LINKS CCL_MAX"
            + "                      WHERE     CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER"
            + "                            AND CCL_MAX.INSTITUTION_NUMBER ="
            + "                                   CCL.INSTITUTION_NUMBER"
            + "                            AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER"
            + "                            AND CCL_MAX.SERVICE_CONTRACT_ID ="
            + "                                   CCL.SERVICE_CONTRACT_ID"
            + "                            AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL)"
            + "       LEFT OUTER JOIN CIS_CLIENT_DETAILS CCD"
            + "          ON     CCL.PARENT_CLIENT_NUMBER = CCD.CLIENT_NUMBER"
            + "             AND CCA.INSTITUTION_NUMBER = CCD.INSTITUTION_NUMBER"
            + "       LEFT OUTER JOIN CIS_SETTLEMENT_INFORMATION CSI"
            + "          ON     CCA.CLIENT_NUMBER = CSI.CLIENT_NUMBER"
            + "             AND CCA.INSTITUTION_NUMBER = CSI.INSTITUTION_NUMBER"
            + "             AND CCA.SETTLEMENT_NUMBER = CSI.SETTLEMENT_NUMBER"
            + "       LEFT OUTER JOIN BWT_CURRENCY CURR"
            + "          ON     CCA.INSTITUTION_NUMBER = CURR.INSTITUTION_NUMBER"
            + "             AND CCA.ACCT_CURRENCY = CURR.ISO_CODE"
            + "             AND CURR.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_ACCOUNT_TYPE_ID ATID"
            + "          ON     CCA.INSTITUTION_NUMBER = ATID.INSTITUTION_NUMBER"
            + "             AND CCA.ACCOUNT_TYPE_ID = ATID.INDEX_FIELD"
            + "             AND ATID.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_ACCOUNT_STATUS ASS"
            + "          ON     CCA.INSTITUTION_NUMBER = ASS.INSTITUTION_NUMBER"
            + "             AND CCA.ACCT_STATUS = ASS.INDEX_FIELD"
            + "             AND ASS.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_COUNTRY CTRY"
            + "          ON     CCA.INSTITUTION_NUMBER = CTRY.INSTITUTION_NUMBER"
            + "             AND CSI.RECEIVER_COUNTRY_CODE = CTRY.INDEX_FIELD"
            + "             AND CTRY.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_STATEMENT_GENERATION SG"
            + "          ON     CCA.INSTITUTION_NUMBER = SG.INSTITUTION_NUMBER"
            + "             AND CCA.STATEMENT_GENERATION = SG.INDEX_FIELD"
            + "             AND SG.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_STATEMENT_TYPE ST"
            + "          ON     CCA.INSTITUTION_NUMBER = ST.INSTITUTION_NUMBER"
            + "             AND CCA.STATEMENT_TYPE = ST.INDEX_FIELD"
            + "             AND ST.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_CALENDAR_TYPE CT"
            + "          ON     CCA.INSTITUTION_NUMBER = CT.INSTITUTION_NUMBER"
            + "             AND CSI.CALENDAR_TYPE = CT.INDEX_FIELD"
            + "             AND CT.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_PAYMENT_METHOD PM"
            + "          ON     CCA.INSTITUTION_NUMBER = PM.INSTITUTION_NUMBER"
            + "             AND CSI.PAYMENT_METHOD = PM.INDEX_FIELD"
            + "             AND PM.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_CLEARING_ENTITY CE"
            + "          ON     CCA.INSTITUTION_NUMBER = CE.INSTITUTION_NUMBER"
            + "             AND CSI.CLEARING_ENTITY = CE.INDEX_FIELD"
            + "             AND CE.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_PAYMENT_METHOD PM1"
            + "          ON     CCA.INSTITUTION_NUMBER = PM1.INSTITUTION_NUMBER"
            + "             AND CSI.PAYMENT_METHOD_DR = PM1.INDEX_FIELD"
            + "             AND PM1.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_CLEARING_ENTITY CE1"
            + "          ON     CCA.INSTITUTION_NUMBER = CE1.INSTITUTION_NUMBER"
            + "             AND CSI.CLEARING_ENTITY_DR = CE1.INDEX_FIELD"
            + "             AND CE1.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN BWT_CLIENT_STATUS BCS1"
            + "          ON     CCA.INSTITUTION_NUMBER = BCS1.INSTITUTION_NUMBER"
            + "             AND CCL.CONTRACT_STATUS = BCS1.INDEX_FIELD"
            + "             AND BCS1.LANGUAGE = 'USA'"
            + "       LEFT OUTER JOIN OMNI_SEPA_MANDATE_INFO OSMI"
            + "          ON     CCA.INSTITUTION_NUMBER = OSMI.INSTITUTION_NUMBER"
            + "             AND CCA.CLIENT_NUMBER = OSMI.CLIENT_NUMBER"
            + "             AND CCA.SETTLEMENT_NUMBER = OSMI.SETTLEMENT_NUMBER"
            + " WHERE     CCA.INSTITUTION_NUMBER = :institutionNumber"
            + "       AND CCA.CLIENT_NUMBER = :clientNumber";

    public static final String QUERY_GET_MERCHANT_SERVICES_NO_CATEGORY = "SELECT BS.INDEX_FIELD SERVICE_INDEX, " +
            "    BS.SERVICE_ID SERVICE_NAME, " +
            "       BSS.SERVICE_STATUS , " +
            "       BACS.INDEX_FIELD MERCH_TARIFF_INDEX, " +
            "       BACS.CONDITION_SET MERCH_TARIFF_DESC, " +
            "       CMF.FLOOR_LIMIT, " +
            "       BC.SWIFT_CODE LIMIT_CURRENCY, " +
            "       CASE WHEN CCA.DINERS_CLEARING = '000' THEN 'CONVEYANCE_CLEARING' " +
            "         WHEN CCA.DINERS_CLEARING = '001' THEN 'DINERS_AND_DISCOVER' " +
            "         WHEN CCA.DINERS_CLEARING = '999' THEN 'NA' " +
            "          ELSE '' END DINERS_CODE, " +
            "       OJCD.STATE_CODE JCB_STATE_CODE_INDEX, " +
            "       OJCD.AREA_CODE_1 JCB_AREA_1_CODE_INDEX, " +
            "       OJCD.AREA_CODE_2 JCB_AREA_CODE_INDEX, " +
            "       CASE WHEN BS.INDEX_FIELD IN ('400') THEN OIMMD.MERCHANT_SUB_ID " +
            "          ELSE '' END MERCHANT_SUB_ID, " +
            "       NVL(TO_CHAR(TO_DATE(SUBSTR(SCS.AUDIT_TRAIL,0,5),'YYDDD'),'YYYYMMDD'),'')  LAST_UPDATED, " +
            "       (SELECT SUI.USERNAME " +
            "    FROM SYS_USER_INFORMATION SUI " +
            "    WHERE USERID = SUBSTR(SCS.AUDIT_TRAIL,14,6) " +
            "    UNION ALL " +
            "    SELECT OUP.CONTACT_NAME " +
            "    FROM OMNI_USER_PROFILE OUP " +
            "    WHERE OUP.SEQUENCE_NO = SUBSTR(SCS.AUDIT_TRAIL,14,6) )  LAST_UPDATED_BY   , " +
            "    CCL.* " +
            "FROM SVC_CLIENT_SERVICE SCS " +
            "INNER JOIN CIS_CLIENT_LINKS CCL ON SCS.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
            "                AND SCS.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
            "                AND SCS.GROUP_NUMBER = CCL.GROUP_NUMBER " +
            "                AND CCL.CONTRACT_STATUS = '001' " +
            "                AND CCL.EFFECTIVE_DATE IN ( SELECT MAX( CCL_MAX.EFFECTIVE_DATE ) " +
            "                              FROM CIS_CLIENT_LINKS CCL_MAX " +
            "                              WHERE CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
            "                                AND CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
            "                                AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER " +
            "                                AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID " +
            "                                AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL) " +
            "INNER JOIN BWT_SERVICES BS ON SCS.SERVICE_ID = BS.INDEX_FIELD " +
            "             AND SCS.INSTITUTION_NUMBER = BS.INSTITUTION_NUMBER " +
            "             AND BS.LANGUAGE = 'USA' " +
            "INNER JOIN BWT_SERVICE_STATUS BSS ON SCS.SERVICE_STATUS = BSS.INDEX_FIELD " +
            "             AND SCS.INSTITUTION_NUMBER = BSS.INSTITUTION_NUMBER " +
            "             AND BSS.LANGUAGE = 'USA' " +
            "INNER JOIN BWT_ACCOUNT_CONDITION_SET BACS ON SCS.CLIENT_TARIFF = BACS.INDEX_FIELD " +
            "             AND SCS.INSTITUTION_NUMBER = BACS.INSTITUTION_NUMBER " +
            "             AND BACS.LANGUAGE = 'USA' " +
            "LEFT OUTER JOIN CBR_MERCHANT_FLOORLIMIT CMF ON SCS.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER " +
            "                      AND SCS.CLIENT_NUMBER = CMF.CLIENT_NUMBER " +
            "                      AND CMF.GROUP_NUMBER IN ( SCS.GROUP_NUMBER,'99999999') " +
            "                      AND SCS.SERVICE_ID = CMF.SERVICE_ID " +
            "                      AND CMF.COUNTRY = '999' " +
            "                      AND CMF.ISO_BUSS_CLASS_GROUP = '999' " +
            "                      AND SCS.EFFECTIVE_DATE <= (SELECT SPD.POSTING_DATE " +
            "                                    FROM SYS_POSTING_DATE SPD " +
            "                                    WHERE SPD.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER " +
            "                                      AND SPD.STATION_NUMBER = '129') " +
            "LEFT OUTER JOIN BWT_CURRENCY BC ON CMF.LIMIT_CURRENCY = BC.ISO_CODE " +
            "                AND CMF.INSTITUTION_NUMBER = BC.INSTITUTION_NUMBER " +
            "                AND BC.LANGUAGE = 'USA' " +
            "LEFT OUTER JOIN CIS_CLIENT_ADDENDUM CCA ON SCS.INSTITUTION_NUMBER = CCA.INSTITUTION_NUMBER " +
            "                    AND SCS.CLIENT_NUMBER = CCA.CLIENT_NUMBER " +
            "LEFT OUTER JOIN OMNI_JCB_CLIENT_DETAILS OJCD ON SCS.INSTITUTION_NUMBER = OJCD.INSTITUTION_NUMBER " +
            "                             AND SCS.CLIENT_NUMBER = OJCD.CLIENT_NUMBER " +
            "                             AND SCS.SERVICE_ID = OJCD.SERVICE_ID " +
            "LEFT OUTER JOIN OMNI_IDEAL_MERCH_MAINT_DETAILS OIMMD ON SCS.INSTITUTION_NUMBER = OIMMD.INSTITUTION_NUMBER " +
            "                                  AND SCS.CLIENT_NUMBER = OIMMD.CLIENT_NUMBER " +
            "WHERE SCS.INSTITUTION_NUMBER = :institutionNumber " +
            "  AND SCS.CLIENT_NUMBER = :internalMerchantId ";

    public static final String QUERY_GET_MERCHANT_SERVICES ="SELECT  SCS.SERVICE_ID " +
                                                            "FROM CIS_CLIENT_LINKS CCL " +
                                                            "INNER JOIN SVC_CLIENT_SERVICE SCS ON CCL.INSTITUTION_NUMBER = SCS.INSTITUTION_NUMBER " +
                                                            "								  AND CCL.CLIENT_NUMBER = SCS.CLIENT_NUMBER " +
                                                            "								  AND CCL.GROUP_NUMBER = SCS.GROUP_NUMBER " +
                                                            "WHERE CCL.INSTITUTION_NUMBER = :institutionNumber " +
                                                            "  AND CCL.CLIENT_NUMBER = :internalMerchantId " +
                                                            "  AND CCL.EFFECTIVE_DATE IN (SELECT MAX(CCL_MAX.EFFECTIVE_DATE) " +
                                                            "			  				  FROM CIS_CLIENT_LINKS CCL_MAX " +
                                                            "			  				  WHERE CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
                                                            "			  				    AND CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
                                                            "			  				    AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER " +
                                                            "			  				    AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID " +
                                                            "			  				    AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL " +
                                                            "			  				    AND CCL_MAX.EXPIRY_DATE >= (SELECT SPD.POSTING_DATE " +
                                                            "			  				    						    FROM SYS_POSTING_DATE SPD " +
                                                            "			  				    						    WHERE SPD.INSTITUTION_NUMBER = CCL_MAX.INSTITUTION_NUMBER " +
                                                            "			  				    						      AND SPD.STATION_NUMBER = '129')) ";

    public static final String QUERY_GET_MERCHANT_SERVICES_BY_ID ="SELECT BS.INDEX_FIELD SERVICE_INDEX, " +
                                                                "       BS.SERVICE_ID SERVICE_NAME, " +
                                                                "       BSS.SERVICE_STATUS , " +
                                                                "       BACS.INDEX_FIELD MERCH_TARIFF_INDEX, " +
                                                                "       BACS.CONDITION_SET MERCH_TARIFF_DESC, " +
                                                                "       ( SELECT CMF.FLOOR_LIMIT " +
                                                                "         FROM CBR_MERCHANT_FLOORLIMIT CMF " +
                                                                "         WHERE SCS.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER " +
                                                                "           AND SCS.CLIENT_NUMBER = CMF.CLIENT_NUMBER " +
                                                                "           AND CMF.GROUP_NUMBER IN ( SCS.GROUP_NUMBER,'99999999') " +
                                                                "           AND SCS.SERVICE_ID = CMF.SERVICE_ID " +
                                                                "           AND CMF.COUNTRY = '999' " +
                                                                "           AND CMF.ISO_BUSS_CLASS_GROUP = '999' " +
                                                                "           AND CMF.EFFECTIVE_DATE <= (SELECT SPD.POSTING_DATE " +
                                                                "                               FROM SYS_POSTING_DATE SPD " +
                                                                "                               WHERE SPD.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER " +
                                                                "                                 AND SPD.STATION_NUMBER = '129')) FLOOR_LIMIT, " +
                                                                "       ( SELECT BC.SWIFT_CODE " +
                                                                "         FROM CBR_MERCHANT_FLOORLIMIT CMF " +
                                                                "				 INNER JOIN BWT_CURRENCY BC ON CMF.LIMIT_CURRENCY = BC.ISO_CODE " +
                                                                "										                AND CMF.INSTITUTION_NUMBER = BC.INSTITUTION_NUMBER " +
                                                                "										                AND BC.LANGUAGE = 'USA' " +
                                                                "         WHERE SCS.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER " +
                                                                "           AND SCS.CLIENT_NUMBER = CMF.CLIENT_NUMBER " +
                                                                "           AND CMF.GROUP_NUMBER IN ( SCS.GROUP_NUMBER,'99999999') " +
                                                                "           AND SCS.SERVICE_ID = CMF.SERVICE_ID " +
                                                                "           AND CMF.COUNTRY = '999' " +
                                                                "           AND CMF.ISO_BUSS_CLASS_GROUP = '999' " +
                                                                "           AND CMF.EFFECTIVE_DATE <= (SELECT SPD.POSTING_DATE " +
                                                                "                               FROM SYS_POSTING_DATE SPD " +
                                                                "                               WHERE SPD.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER " +
                                                                "                                 AND SPD.STATION_NUMBER = '129'))LIMIT_CURRENCY, " +
                                                                "       CASE WHEN BS.INDEX_FIELD IN ('212','406') AND CCA.DINERS_CLEARING = '000' THEN 'CONVEYANCE_CLEARING' " +
                                                                "         WHEN BS.INDEX_FIELD IN ('212','406') AND CCA.DINERS_CLEARING = '001' THEN 'DINERS_AND_DISCOVER' " +
                                                                "         WHEN BS.INDEX_FIELD IN ('212','406') AND CCA.DINERS_CLEARING = '999' THEN 'NA' " +
                                                                "          ELSE '' END DINERS_CODE, " +
                                                                "       OJCD.STATE_CODE JCB_STATE_CODE_INDEX, " +
                                                                "       OJCD.AREA_CODE_1 JCB_AREA_1_CODE_INDEX, " +
                                                                "       OJCD.AREA_CODE_2 JCB_AREA_CODE_INDEX, " +
                                                                "       CASE WHEN BS.INDEX_FIELD IN ('400') THEN OIMMD.MERCHANT_SUB_ID " +
                                                                "          ELSE '' END MERCHANT_SUB_ID, " +
                                                                "       NVL(TO_CHAR(TO_DATE(SUBSTR(SCS.AUDIT_TRAIL,0,5),'YYDDD'),'YYYYMMDD'),'')  LAST_UPDATED, " +
                                                                "       (SELECT SUI.USERNAME " +
                                                                "    FROM SYS_USER_INFORMATION SUI " +
                                                                "    WHERE USERID = SUBSTR(SCS.AUDIT_TRAIL,14,6) " +
                                                                "    UNION ALL " +
                                                                "    SELECT OUP.CONTACT_NAME " +
                                                                "    FROM OMNI_USER_PROFILE OUP " +
                                                                "    WHERE OUP.SEQUENCE_NO = SUBSTR(SCS.AUDIT_TRAIL,14,6) )  LAST_UPDATED_BY   , " +
                                                                "    CCL.* " +
                                                                "FROM SVC_CLIENT_SERVICE SCS " +
                                                                "INNER JOIN CIS_CLIENT_LINKS CCL ON SCS.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
                                                                "                AND SCS.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
                                                                "                AND SCS.GROUP_NUMBER = CCL.GROUP_NUMBER " +
                                                                "                AND CCL.CONTRACT_STATUS = '001' " +
                                                                "                AND CCL.EFFECTIVE_DATE IN ( SELECT MAX( CCL_MAX.EFFECTIVE_DATE ) " +
                                                                "                              FROM CIS_CLIENT_LINKS CCL_MAX " +
                                                                "                              WHERE CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
                                                                "                                AND CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
                                                                "                                AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER " +
                                                                "                                AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID " +
                                                                "                                AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL) " +
                                                                "INNER JOIN BWT_SERVICES BS ON SCS.SERVICE_ID = BS.INDEX_FIELD " +
                                                                "             AND SCS.INSTITUTION_NUMBER = BS.INSTITUTION_NUMBER " +
                                                                "             AND BS.LANGUAGE = 'USA' " +
                                                                "INNER JOIN BWT_SERVICE_STATUS BSS ON SCS.SERVICE_STATUS = BSS.INDEX_FIELD " +
                                                                "             AND SCS.INSTITUTION_NUMBER = BSS.INSTITUTION_NUMBER " +
                                                                "             AND BSS.LANGUAGE = 'USA' " +
                                                                "INNER JOIN BWT_ACCOUNT_CONDITION_SET BACS ON SCS.CLIENT_TARIFF = BACS.INDEX_FIELD " +
                                                                "             AND SCS.INSTITUTION_NUMBER = BACS.INSTITUTION_NUMBER " +
                                                                "             AND BACS.LANGUAGE = 'USA' " +
                                                                "LEFT OUTER JOIN CIS_CLIENT_ADDENDUM CCA ON SCS.INSTITUTION_NUMBER = CCA.INSTITUTION_NUMBER " +
                                                                "                    AND SCS.CLIENT_NUMBER = CCA.CLIENT_NUMBER " +
                                                                "LEFT OUTER JOIN OMNI_JCB_CLIENT_DETAILS OJCD ON SCS.INSTITUTION_NUMBER = OJCD.INSTITUTION_NUMBER " +
                                                                "                             AND SCS.CLIENT_NUMBER = OJCD.CLIENT_NUMBER " +
                                                                "                             AND SCS.SERVICE_ID = OJCD.SERVICE_ID " +
                                                                "LEFT OUTER JOIN OMNI_IDEAL_MERCH_MAINT_DETAILS OIMMD ON SCS.INSTITUTION_NUMBER = OIMMD.INSTITUTION_NUMBER " +
                                                                "                                  AND SCS.CLIENT_NUMBER = OIMMD.CLIENT_NUMBER " +
                                                                "WHERE SCS.INSTITUTION_NUMBER = :institutionNumber " +
                                                                "  AND SCS.CLIENT_NUMBER = :internalMerchantId " +
                                                                "   AND BS.INDEX_FIELD = nvl(:serviceIdIndex,BS.INDEX_FIELD) ";

    public static final String QUERY_INSTITUTION_ACCOUNT_CURRENCY = "SELECT UPPER(SWIFT_CODE) FROM BWT_CURRENCY WHERE INSTITUTION_NUMBER=:institutionNumber AND LANGUAGE = 'USA'";

    public static final String QUERY_INSTITUTION_ACCOUNT_TYPE = "SELECT INDEX_FIELD FROM BWT_ACCOUNT_TYPE_ID WHERE INSTITUTION_NUMBER = :institutionNumber AND LANGUAGE = 'USA'";

    public static final String QUERY_UPDATE_MERCHANT_ACCOUNT = "UPDATE BW3.CAS_CLIENT_ACCOUNT CCA SET CCA.AUDIT_TRAIL = ?, CCA.STATEMENT_GENERATION = ?, CCA.STATEMENT_TYPE = ?, CCA.ACCT_STATUS = ? WHERE CCA.INSTITUTION_NUMBER = ?  AND CCA.ACCT_NUMBER = ?";

    public static final String QUERY_GET_MERCHANT_CONTRACT_STATUS = "SELECT CCL.CONTRACT_STATUS FROM CIS_CLIENT_LINKS CCL WHERE CCL.INSTITUTION_NUMBER = :institutionNumber AND CCL.CLIENT_NUMBER = :clientNumber AND CCL.EFFECTIVE_DATE IN (SELECT MAX( CCL_MAX.EFFECTIVE_DATE) FROM CIS_CLIENT_LINKS CCL_MAX WHERE CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER AND CCL_MAX.INSTITUTION_NUMBER =  CCL.INSTITUTION_NUMBER AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL AND CCL_MAX.EXPIRY_DATE >= (SELECT SPD.POSTING_DATE FROM SYS_POSTING_DATE SPD WHERE INSTITUTION_NUMBER = CCL_MAX.INSTITUTION_NUMBER AND SPD.STATION_NUMBER = '129'))";

    public static final String UPDATE_MERCHANT_ACCOUNT = "UPDATE BW3.CAS_CLIENT_ACCOUNT CCA SET CCA.AUDIT_TRAIL = :auditTrail, CCA.STATEMENT_GENERATION = :statementGenerationCode, CCA.STATEMENT_TYPE = :statementTypeIndex, CCA.ACCT_STATUS = :accountStatus WHERE CCA.INSTITUTION_NUMBER = :institutionNumber  AND CCA.ACCT_NUMBER = :internalAccountNumber";

    public static final String QUERY_STATEMENT_GENERATION_COUNT = "SELECT COUNT(*) FROM BWT_STATEMENT_GENERATION WHERE INSTITUTION_NUMBER = :institutionNumber AND INDEX_FIELD = :statementGeneration AND LANGUAGE = 'USA' ";

    public static final String QUERY_STATEMENT_TYPE_COUNT = "SELECT COUNT(*) FROM BWT_STATEMENT_TYPE WHERE INSTITUTION_NUMBER = :institutionNumber AND INDEX_FIELD = :statementType AND LANGUAGE = 'USA' ";

    public static final String QUERY_ACCOUNT_STATUS_COUNT = "SELECT COUNT(*) FROM BWT_ACCOUNT_STATUS WHERE INSTITUTION_NUMBER = :institutionNumber AND INDEX_FIELD = :accountStatus AND LANGUAGE = 'USA' ";

    public static final String QUERY_CHECK_VOLTAGE_STATUS = "SELECT OVLT_UTILITY.is_voltage_enabled(:institutionNumber) VOLT FROM dual";

    public static final String QUERY_CHECK_VOLTAGE_EXCLUSIVE = "SELECT NVL (CENAB.CONFIG_VALUE, 'X') SECURE_DATA_ENABLED, NVL (CDUALC.CONFIG_VALUE, 'X') DUAL_COLUMN_ENABLED FROM SYS_CONFIGURATION CENAB INNER JOIN SYS_CONFIGURATION CDUALC ON CDUALC.INSTITUTION_NUMBER = CENAB.INSTITUTION_NUMBER AND CDUALC.CONFIG_SECTION = CENAB.CONFIG_SECTION WHERE CENAB.INSTITUTION_NUMBER = :institutionNumber AND CENAB.CONFIG_SECTION = 'SecureData' AND CENAB.CONFIG_KEYWORD = 'Enabled' AND CDUALC.CONFIG_KEYWORD = 'DualColumn' ";

    public static final String UPDATE_SETTLEMENT_INFORMATION = "UPDATE BW3.CIS_SETTLEMENT_INFORMATION CSI SET CSI.AUDIT_TRAIL = ?1, CSI.RECEIVER_COUNTRY_CODE = ?2, CSI.PAYMENT_REFERENCE = ?3, CSI.CALENDAR_TYPE = ?4, CSI.CONTING_LIAB_ACCOUNT = ?5, CSI.COUNTER_BANK_NAME = ?6, CSI.COUNTER_BANK_NUMBER = ?7, CSI.COUNTER_BANK_CITY = ?8, CSI.COUNTER_BANK_ACCOUNT_NAME = ?9, CSI.IBAN_REFERENCE = ?10, CSI.SEC_IBAN_REFERENCE = ?11, CSI.BANK_TEL_NUMBER = ?12, CSI.BANK_CONTACT_NAME = ?13, CSI.CORRESP_BANK_ACCOUNT = ?14, CSI.CALENDAR_DAYS = ?15, CSI.REUTERS_CODE = ?16, CSI.PAYMENT_METHOD = ?17, CSI.CLEARING_ENTITY = ?18, CSI.COUNTER_BANK_NAME_DR = ?19, CSI.COUNTER_BANK_NUMBER_DR = ?20, CSI.COUNTER_BANK_CITY_DR = ?21, CSI.COUNTER_BANK_ACCOUNT_NAME_DR = ?22, CSI.IBAN_REFERENCE_DR = ?23, CSI.SEC_IBAN_REFERENCE_DR = ?24, CSI.BANK_TEL_NUMBER_DR = ?25, CSI.BANK_CONTACT_NAME_DR = ?26, CSI.CORRESP_BANK_ACCOUNT_DR = ?27, CSI.CALENDAR_DAYS_DR = ?28, CSI.REUTERS_CODE_DR = ?29, CSI.PAYMENT_METHOD_DR = ?30, CSI.CLEARING_ENTITY_DR = ?31, CSI.COUNTER_BANK_ACCOUNT = ?32, CSI.SEC_COUNTER_BANK_ACCOUNT = ?33, CSI.COUNTER_BANK_ACCOUNT_DR = ?34, CSI.SEC_COUNTER_BANK_ACCOUNT_DR = ?35, CSI.CORRESP_BANK_NUMBER = ?36, CSI.CORRESP_BANK_NUMBER_DR = ?37, CSI.FUNDING_NARRATIVE = ?38, CSI.FUNDING_NARRATIVE_DR = ?39 WHERE CSI.CLIENT_NUMBER = ?40 AND CSI.INSTITUTION_NUMBER = ?41 AND CSI.SETTLEMENT_NUMBER IN ( SELECT CCA.SETTLEMENT_NUMBER FROM CAS_CLIENT_ACCOUNT CCA WHERE CCA.INSTITUTION_NUMBER = CSI.INSTITUTION_NUMBER AND CCA.ACCT_NUMBER = ?42 )";

    public static final String GET_SEPA_MANDATE_POPULATION_COUNT = "SELECT COUNT(*) FROM OMNI_PROD.OMNI_SEPA_MANDATE_INFO OSMI WHERE OSMI.INSTITUTION_NUMBER = :institutionNumber AND OSMI.CLIENT_NUMBER = :clientNumber AND OSMI.SETTLEMENT_NUMBER IN ( SELECT CCA.SETTLEMENT_NUMBER FROM CAS_CLIENT_ACCOUNT CCA WHERE CCA.INSTITUTION_NUMBER = CSI.INSTITUTION_NUMBER AND CCA.ACCT_NUMBER = :internalAccountNumber )";

    public static final String QUERY_UPDATE_SEPA_MANDATE_POPULATION = "UPDATE OMNI_PROD.OMNI_SEPA_MANDATE_INFO OSMI SET OSMI.FIRST_DEBIT_DATE = :firstDebitDateField, IFS_REJECT_YN = 'N' WHERE OSMI.INSTITUTION_NUMBER = :institutionNumber AND OSMI.CLIENT_NUMBER = :clientNumber AND OSMI.SETTLEMENT_NUMBER IN ( SELECT CCA.SETTLEMENT_NUMBER FROM CAS_CLIENT_ACCOUNT CCA WHERE CCA.INSTITUTION_NUMBER = OSMI.INSTITUTION_NUMBER AND CCA.ACCT_NUMBER = :internalAccountNumber)";

    public static final String QUERY_INSERT_SEPA_MANDATE_POPULATION = "INSERT INTO OMNI_PROD.OMNI_SEPA_MANDATE_INFO (INSTITUTION_NUMBER, CLIENT_NUMBER, FIRST_DEBIT_DATE, SETTLEMENT_NUMBER, IFS_REJECT_YN ) VALUES (:institutionNumber, :clientNumber, '00000000', (SELECT CCA.SETTLEMENT_NUMBER FROM CAS_CLIENT_ACCOUNT CCA WHERE CCA.INSTITUTION_NUMBER = :institutionNumber  AND CCA.ACCT_NUMBER = :internalAccountNumber),'N')";

    public static final String QUERY_UPDATE_NEXT_APPLICATION = "UPDATE CBR_SEQUENCE_NUMBERS SET SEQUENCE_VALUE = TO_CHAR (TO_NUMBER (SEQUENCE_VALUE) + 1, 'FM0000000000') WHERE INSTITUTION_NUMBER = :institutionNumber AND SEQUENCE_ID = '017'";

    public static final String QUERY_SELECT_NEXT_APPLICATION_NUMBER = "SELECT TO_CHAR (TO_NUMBER (SEQUENCE_VALUE), 'FM0000000000') FROM CBR_SEQUENCE_NUMBERS WHERE INSTITUTION_NUMBER = :institutionNumber AND SEQUENCE_ID = '017'";

    public static final String QUERY_GET_INST_LOCAL_CURRENCY = "SELECT CONFIG_VALUE FROM (SELECT CONFIG_VALUE FROM BW3.SYS_CONFIGURATION SC WHERE SC.CONFIG_KEYWORD = 'LocalCurrencyISO' AND SC.INSTITUTION_NUMBER IN ('00000000',:institutionNumber) ORDER BY INSTITUTION_NUMBER DESC ) A WHERE ROWNUM <2";

    public static final String QUERY_INSERT_APP_DETAILS = "INSERT INTO CIS_APPLICATION_DETAIL( " +
            "        INSTITUTION_NUMBER,APPLICATION_NUMBER,RECORD_DATE, " +
            "        RECORD_TYPE,CLIENT_NUMBER, APPLICATION_STATUS, " +
            "        CONTACT_NAME,VAT_REG_NUMBER,REGISTRATION_NUMBER, " +
            "        CLIENT_TYPE,SHORT_NAME,COMPANY_NAME, " +
            "        TRADE_NAME,SERVICE_CONTRACT_ID,CONDITION_SET, " +
            "        LIMIT_CURRENCY,CLIENT_LEVEL,PARENT_APPL_NUMBER, " +
            "        LAST_AMENDMENT_DATE,AUDIT_TRAIL,GROUP_NUMBER, " +
            "        CREDIT_DELTA_INDICATOR,CROSS_BORDER_FEE_IND,DOMESTIC_MCC, " +
            "        MC_IP_QUALIFICATION,VISA_IP_QUALIFICATION, SEC_VAT_REG_NUMBER," +
            "SEC_REGISTRATION_NUMBER, APPLICATION_SOURCE ) " +
            "SELECT ?1, ?2,TO_CHAR(SYSDATE,'YYYYMMDD'), '053',?3,'002', CDET.CONTACT_NAME,CDET.VAT_REG_NUMBER,CDET.REGISTRATION_NUMBER, CDET.CLIENT_TYPE,CDET.SHORT_NAME,CDET.COMPANY_NAME, " +
            "CDET.TRADE_NAME,CLNK.SERVICE_CONTRACT_ID,CLNK.CLIENT_TARIFF, " +
            "?4,CLNK.CLIENT_LEVEL,'0000000000', " +
            "CDET.LAST_AMENDMENT_DATE,?5,CLNK.GROUP_NUMBER, " +
            "CDET.CREDIT_DELTA_INDICATOR,CDET.CROSS_BORDER_FEE_IND,CDET.DOMESTIC_MCC, " +
            "CDET.MC_IP_QUALIFICATION, CDET.VISA_IP_QUALIFICATION, ?6, ?7, '100' " +
            "FROM CIS_CLIENT_DETAILS CDET, " +
            "CIS_CLIENT_LINKS CLNK " +
            "WHERE CDET.INSTITUTION_NUMBER = ?8 " +
            "AND CDET.CLIENT_NUMBER = ?9 " +
            "AND CLNK.INSTITUTION_NUMBER = CDET.INSTITUTION_NUMBER " +
            "AND CLNK.CLIENT_NUMBER = CDET.CLIENT_NUMBER " +
            "AND CLNK.CLIENT_NUMBER != CLNK.PARENT_CLIENT_NUMBER " +
            "AND CLNK.EFFECTIVE_DATE =  (SELECT MAX(A2.EFFECTIVE_DATE) " +
            "FROM CIS_CLIENT_LINKS A2 " +
            "WHERE A2.CLIENT_NUMBER = CLNK.CLIENT_NUMBER " +
            "AND A2.INSTITUTION_NUMBER = ?10 " +
            "AND A2.CLIENT_LEVEL = CLNK.CLIENT_LEVEL " +
            "AND A2.EFFECTIVE_DATE <= ?11) ";

    public static final String QUERY_POST_MERCHANT_ACCOUNT = "INSERT INTO CIS_APPLICATION_ACCT_TYPE (INSTITUTION_NUMBER, APPLICATION_NUMBER, ACCOUNT_TYPE_ID, ACCT_CURRENCY, RECORD_TYPE, RECORD_DATE, BILLING_LEVEL, BANK_CLEARING_NUMBER, SETTLEMENT_BANK_NAME, BANK_CONTACT_NAME, BANK_TEL_NUMBER, COUNTER_BANK_ACCOUNT, LIMIT_CURRENCY, CLIENT_LIMIT, BANK_GUARANTEE, PAYMENT_REFERENCE, AUDIT_TRAIL, CORRESP_BANK_NUMBER, COUNTER_BANK_ACCOUNT_NAME, RECEIVER_COUNTRY_CODE, REUTERS_CODE, STATEMENT_TYPE, STATEMENT_GENERATION, ACCT_STARTUP_DATE, IBAN_REFERENCE, FUNDING_NARRATIVE, BANK_CONTACT_NAME_DR, BANK_TEL_NUMBER_DR, COUNTER_BANK_ACCOUNT_DR, CORRESP_BANK_NUMBER_DR, COUNTER_BANK_ACCOUNT_NAME_DR, IBAN_REFERENCE_DR, FUNDING_NARRATIVE_DR, REUTERS_CODE_DR, BANK_CLEARING_NUMBER_DR, SETTLEMENT_BANK_NAME_DR, SETTLEMENT_BANK_CITY, SETTLEMENT_BANK_CITY_DR, PAYMENT_METHOD, PAYMENT_METHOD_DR, CLEARING_ENTITY, CLEARING_ENTITY_DR, CORRESP_BANK_ACCOUNT, CORRESP_BANK_ACCOUNT_DR, CALENDAR_TYPE, CALENDAR_DAYS_DR, SEC_COUNTER_BANK_ACCOUNT, SEC_IBAN_REFERENCE, SEC_COUNTER_BANK_ACCOUNT_DR, SEC_IBAN_REFERENCE_DR )VALUES (?1, ?2, ?3, ?4, '003', ?5, ?6, ?7, ?8, ?9, ?10, ?11, NULL, NULL, NULL, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28, ?29, ?30, ?31, ?32, ?33, ?34, ?35, ?36, ?37, ?38, ?39, ?40, ?41, ?42, ?43, ?44, ?45, ?46)";

    public static final String QUERY_GET_PARENT_ACCOUNT = "SELECT CCA.ACCOUNT_TYPE_ID, BC.SWIFT_CODE ACCT_CURRENCY, CCA.BILLING_LEVEL FROM CAS_CLIENT_ACCOUNT CCA INNER JOIN BWT_CURRENCY BC ON CCA.ACCT_CURRENCY = BC.ISO_CODE AND CCA.INSTITUTION_NUMBER = BC.INSTITUTION_NUMBER AND BC.LANGUAGE = 'USA' WHERE CCA.INSTITUTION_NUMBER = :institutionNumber AND CCA.CLIENT_NUMBER = :parentInternalMerchantId AND CCA.ACCT_STATUS = '001'";

    public static final String QUERY_GET_APPL_STATUS = "SELECT APPLICATION_STATUS FROM CIS_APPLICATION_DETAIL WHERE INSTITUTION_NUMBER = :institutionNumber AND APPLICATION_NUMBER = :applicationNumber";

    public static final String QUERY_UPDATE_SERVICE_STATUS_TARIFF = "UPDATE SVC_CLIENT_SERVICE " +
            " SET SERVICE_STATUS = NVL(:status, SERVICE_STATUS),  " +
            "   CLIENT_TARIFF = NVL(:tariffIndex, CLIENT_TARIFF)  " +
            "WHERE ROWID IN (SELECT SCS.ROWID " +
            "        FROM SVC_CLIENT_SERVICE SCS " +
            "        INNER JOIN CIS_CLIENT_LINKS CCL ON SCS.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
            "                        AND SCS.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
            "                        AND SCS.GROUP_NUMBER = CCL.GROUP_NUMBER " +
            "                        AND CCL.CONTRACT_STATUS = '001' " +
            "                        AND CCL.EFFECTIVE_DATE IN ( SELECT MAX( CCL_MAX.EFFECTIVE_DATE ) " +
            "                                      FROM CIS_CLIENT_LINKS CCL_MAX " +
            "                                      WHERE CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER " +
            "                                        AND CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER " +
            "                                        AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER " +
            "                                        AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID " +
            "                                        AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL) " +
            "        WHERE SCS.INSTITUTION_NUMBER = :institutionNumber " +
            "          AND SCS.CLIENT_NUMBER = :internalMerchantId " +
            "          AND SCS.SERVICE_ID = :serviceIdIndex )";

    public static final String QUERY_GET_CURRENT_TARIFF = "SELECT CLIENT_TARIFF FROM SVC_CLIENT_SERVICE " +
                                                            " WHERE INSTITUTION_NUMBER = :institutionNumber " +
                                                            "  AND CLIENT_NUMBER = :internalMerchantId " +
                                                            "  AND SERVICE_ID = :serviceIndex";
    
    public static final String QUERY_INSERT_SERVICE_STATUS_TARIFF = "insert into svc_client_service " +
                                                                        "(RECORD_DATE, INSTITUTION_NUMBER, EMBOSS_LINE_1, SERVICE_STATUS, EXPIRY_DATE, " +
                                                                        " CLIENT_NUMBER, SERVICE_CONTRACT_ID, GROUP_NUMBER, SERVICE_ID, AUDIT_TRAIL,  " +
                                                                        " RECORD_TYPE, CLIENT_TARIFF, EFFECTIVE_DATE, SERVICE_CATEGORY, REVIEW_DATE)    " +
                                                                        "  select to_char(sysdate,'yyyyMMdd') record_date, " +
                                                                        "          ccl.institution_number, " +
                                                                        "          ccd.short_name, " +
                                                                        "          :status,  " +
                                                                        "          '99991231' expiry_date, " +
                                                                        "          ccl.client_number, " +
                                                                        "          ccl.service_contract_id, " +
                                                                        "          ccl.group_number, " +
                                                                        "          :serviceIndex, " +
                                                                        "          :auditTrail, " +
                                                                        "          '003' record_type, " +
                                                                        "          :tariffIndex, " +
                                                                        "          (select to_char( to_date(spd.posting_Date,'yyyyMMdd') + 1, 'yyyyMMdd') " +
                                                                        "           from sys_posting_Date spd " +
                                                                        "           where spd.institution_number = ccl.institution_number  " +
                                                                        "             and spd.station_number = '129') effective_Date, " +
                                                                        "             '002' service_category, " +
                                                                        "          '99991231' renew_date " +
                                                                        "   FROM CIS_CLIENT_LINKS CCL   " +
                                                                        "   inner join cis_client_details ccd on ccl.institution_number = ccd.institution_number " +
                                                                        "                                    and ccl.client_number = ccd.client_number " +
                                                                        "            WHERE CCL.institution_number = :institutionNumber " +
                                                                        "                and ccl.client_number = :internalMerchantId " +
                                                                        "              AND CCL.EFFECTIVE_DATE = ( SELECT MAX(CCL_MAX.EFFECTIVE_DATE)   " +
                                                                        "                                         FROM CIS_CLIENT_LINKS CCL_MAX   " +
                                                                        "                                         WHERE CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER   " +
                                                                        "                                           AND CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER   " +
                                                                        "                                           AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER   " +
                                                                        "                                           AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID   " +
                                                                        "                                           AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL " +
                                                                        "                                           AND CCL.EXPIRY_DATE >= ( SELECT SPD.POSTING_DATE   " +
                                                                        "                                                                    FROM SYS_POSTING_DATE SPD   " +
                                                                        "                                                                    WHERE SPD.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER   " +
                                                                        "                                                                    AND SPD.STATION_NUMBER = '129'))";

    public static final String QUERY_INSERT_SERVICE_FLOOR_LIMIT_LIMIT_CURR = "INSERT INTO BW3.CBR_MERCHANT_FLOORLIMIT " +
                                                                            "(INSTITUTION_NUMBER,SERVICE_ID, COUNTRY,ISO_BUSS_CLASS_GROUP, " +
                                                                            "GROUP_NUMBER,CLIENT_NUMBER,EFFECTIVE_DATE   ,LIMIT_CURRENCY, " +
                                                                            "FLOOR_LIMIT,RECORD_DATE,AUDIT_TRAIL, TRAN_CURRENCY) " +
                                                                            "VALUES " +
                                                                            "(:institutionNumber, :serviceIdIndex, '999','999', " +
                                                                            "'99999999', :internalMerchantId, (SELECT SPD.POSTING_DATE " +
                                                                            "                                                 FROM SYS_POSTING_DATE SPD " +
                                                                            "                                                 WHERE SPD.INSTITUTION_NUMBER = :institutionNumber " +
                                                                            "                                                   AND SPD.STATION_NUMBER = '129'), CASE WHEN :limitCurrency = ' ' THEN '' ELSE :limitCurrency END, " +
                                                                            "CASE WHEN :floorLimit = ' ' THEN '' ELSE :floorLimit END, '', :auditTrail, '')";

    public static final String QUERY_UPDATE_SERVICE_FLOOR_LIMIT_LIMIT_CURR = "UPDATE CBR_MERCHANT_FLOORLIMIT  " +
                                                                                "SET FLOOR_LIMIT = DECODE( :floorLimit, ' ', null, NVL(:floorLimit, FLOOR_LIMIT)),  " +
                                                                                "    LIMIT_CURRENCY = DECODE( :limitCurrency, ' ', null, NVL(:limitCurrency, LIMIT_CURRENCY))  " +
                                                                                "where rowid in (SELECT CMF.ROWID  " +
                                                                                "   FROM SVC_CLIENT_SERVICE SCS  " +
                                                                                "   INNER JOIN CIS_CLIENT_LINKS CCL ON SCS.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER  " +
                                                                                "      AND SCS.CLIENT_NUMBER = CCL.CLIENT_NUMBER  " +
                                                                                "      AND SCS.GROUP_NUMBER = CCL.GROUP_NUMBER  " +
                                                                                "      AND CCL.CONTRACT_STATUS = '001'  " +
                                                                                "            AND CCL.EFFECTIVE_DATE IN ( SELECT MAX( CCL_MAX.EFFECTIVE_DATE )  " +
                                                                                "                 FROM CIS_CLIENT_LINKS CCL_MAX  " +
                                                                                "              WHERE CCL_MAX.INSTITUTION_NUMBER = CCL.INSTITUTION_NUMBER  " +
                                                                                "                             AND CCL_MAX.CLIENT_NUMBER = CCL.CLIENT_NUMBER  " +
                                                                                "          AND CCL_MAX.GROUP_NUMBER = CCL.GROUP_NUMBER  " +
                                                                                "          AND CCL_MAX.SERVICE_CONTRACT_ID = CCL.SERVICE_CONTRACT_ID  " +
                                                                                "                                                                           AND CCL_MAX.CLIENT_LEVEL = CCL.CLIENT_LEVEL)  " +
                                                                                "  INNER JOIN CBR_MERCHANT_FLOORLIMIT CMF ON SCS.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER  " +
                                                                                "       AND SCS.CLIENT_NUMBER = CMF.CLIENT_NUMBER  " +
                                                                                "       AND CMF.GROUP_NUMBER IN ( SCS.GROUP_NUMBER,'99999999')  " +
                                                                                "                        AND SCS.SERVICE_ID = CMF.SERVICE_ID  " +
                                                                                "       AND CMF.COUNTRY = '999'  " +
                                                                                "       AND CMF.ISO_BUSS_CLASS_GROUP = '999'  " +
                                                                                "       AND SCS.EFFECTIVE_DATE <= (SELECT SPD.POSTING_DATE  " +
                                                                                "              FROM SYS_POSTING_DATE SPD  " +
                                                                                "              WHERE SPD.INSTITUTION_NUMBER = CMF.INSTITUTION_NUMBER  " +
                                                                                "                AND SPD.STATION_NUMBER = '129')  " +
                                                                                "  WHERE SCS.INSTITUTION_NUMBER = :institutionNumber  " +
                                                                                "    AND SCS.CLIENT_NUMBER = :internalMerchantId  " +
                                                                                " AND SCS.SERVICE_ID = :serviceIdIndex)";


    public static final String QUERY_UPDATE_SERVICE_DINERS_CODE = "UPDATE CIS_CLIENT_ADDENDUM  " +
                                                                "   SET DINERS_CLEARING = DECODE( :dinersCode, ' ', null, NVL(:dinersCode, DINERS_CLEARING))  " +
                                                                " WHERE INSTITUTION_NUMBER = :institutionNumber  " +
                                                                "       AND CLIENT_NUMBER = :internalMerchantId ";
    
    public static final String QUERY_INSERT_SERVICE_DINERS_CODE = "INSERT INTO CIS_CLIENT_ADDENDUM " +
                                                                    "(DINERS_CLEARING, INSTITUTION_NUMBER, CLIENT_NUMBER) " +
                                                                    "VALUES " +
                                                                    "(:dinerCode, :institutionNumber, :internalMerchantId)";
    
    public static final String QUERY_GET_DINERS_CODE = "SELECT DINERS_CLEARING FROM CIS_CLIENT_ADDENDUM   " +
                                                        "    WHERE INSTITUTION_NUMBER = :institutionNumber  " +
                                                        "    AND CLIENT_NUMBER = :internalMerchantId   ";
    
    public static final String QUERY_GET_CLIENT_SERVICE = "SELECT * FROM SVC_CLIENT_SERVICE  " +
                                                            "                    WHERE INSTITUTION_NUMBER = :institutionNumber " +
                                                            "                     AND CLIENT_NUMBER = :internalMerchantId " +
                                                            "                     AND SERVICE_ID = :serviceIndex ";
    
    public static final String QUERY_UPDATE_SERVICE_JCB_INDEX = "UPDATE OMNI_PROD.OMNI_JCB_CLIENT_DETAILS  " +
            "   SET STATE_CODE = DECODE( :jcbStateCodeIndex, ' ', null, NVL(:jcbStateCodeIndex, STATE_CODE)),  " +
            "       AREA_CODE_1 = DECODE( :jcbArea1CodeIndex, ' ', null, NVL(:jcbArea1CodeIndex, AREA_CODE_1)),  " +
            "       AREA_CODE_2 = DECODE( :jcbAreaCodeIndex, ' ', null, NVL(:jcbAreaCodeIndex, AREA_CODE_2)) " +
            " WHERE INSTITUTION_NUMBER = :institutionNumber  " +
            "       AND CLIENT_NUMBER = :internalMerchantId  " +
            "       AND SERVICE_ID = :serviceIdIndex";

    public static final String QUERY_UPDATE_SERVICE_NEW_JCB_INDEX = "INSERT INTO OMNI_PROD.OMNI_JCB_CLIENT_DETAILS (INSTITUTION_NUMBER, " +
            "                                               CLIENT_NUMBER,  " +
            "                                               STATE_CODE,  " +
            "                                               AREA_CODE_1,  " +
            "                                               AREA_CODE_2,  " +
            "                                               SERVICE_ID)  " +
                                    "     VALUES ( :institutionNumber,  " +
                                    "             :internalMerchantId,  " +
                                    "             CASE WHEN :jcbStateCodeIndex = ' ' THEN  NULL ELSE :jcbStateCodeIndex END,  " +
                                    "             CASE WHEN :jcbArea1CodeIndex = ' ' THEN  NULL ELSE :jcbArea1CodeIndex END, " +
                                    "             CASE WHEN :jcbAreaCodeIndex = ' ' THEN  NULL ELSE :jcbAreaCodeIndex END, " +
                                    "             :serviceIdIndex )";

    public static final String QUERY_UPDATE_SERVICE_MERC_SUB_ID = "UPDATE OMNI_PROD.OMNI_IDEAL_MERCH_MAINT_DETAILS   " +
                                                                "   SET MERCHANT_SUB_ID = DECODE( :merchantSubId, ' ', null, NVL(:merchantSubId, MERCHANT_SUB_ID)   " +
                                                                "     WHERE INSTITUTION_NUMBER = :institutionNumber   " +
                                                                "       AND CLIENT_NUMBER = :internalMerchantId";

    public static final String QUERY_UPDATE_SERVICE_NEW_MERC_SUB_ID = "INSERT INTO OMNI_PROD.OMNI_IDEAL_MERCH_MAINT_DETAILS    " +
                                                                        "(INSTITUTION_NUMBER, CLIENT_NUMBER, MERCHANT_SUB_ID)    " +
                                                                        "VALUES    " +
                                                                        "(:institutionNumber, :internalMerchantId,  CASE WHEN :merchantSubId = ' ' THEN '' ELSE :merchantSubId END)";

    public static final String QUERY_GET_INSTITUTION_SERVICES_TARIFFS = "SELECT DISTINCT CTC.SERVICE_ID, CTC.CLIENT_TARIFF   " +
                                                                        "FROM CBR_TRANSACTION_CHARGES CTC  " +
                                                                        "WHERE CTC.INSTITUTION_NUMBER = :institutionNumber  " +
                                                                        "  AND CTC.CLIENT_NUMBER = '00000000'  " +
                                                                        "  AND SERVICE_CONTRACT_ID = :serviceContractId  " +
                                                                        "ORDER BY CTC.SERVICE_ID ";

    public static final String QUERY_VALIDATE_SERVICE_ID_AND_TARIFF =  "select ROWNUM, a.* " +
                                                                        "  from ( SELECT DISTINCT BSCI.INDEX_FIELD SERVICE_CONTACT_ID, " +
                                                                        "                BSCI.SERVICE_CONTRACT SERVICE_CONTACT_ID_DESCRIPTION, " +
                                                                        "                BACS.INDEX_FIELD MERCHANT_TARIFF_INDEX, " +
                                                                        "                BACS.CONDITION_SET MERCHANT_TARIFF_DESCRIPTION, " +
                                                                        "                BS.INDEX_FIELD SERVICE_CODE, " +
                                                                        "                BS.SERVICE_ID SERVICE_DESCRIPTION " +
                                                                        "FROM CBR_TRANSACTION_CHARGES CTC " +
                                                                        "INNER JOIN BWT_SERVICE_CONTRACT_ID BSCI ON CTC.INSTITUTION_NUMBER = BSCI.INSTITUTION_NUMBER " +
                                                                        "                                        AND CTC.SERVICE_CONTRACT_ID = BSCI.INDEX_FIELD " +
                                                                        "                                        AND BSCI.LANGUAGE = 'USA' " +
                                                                        "INNER JOIN BWT_ACCOUNT_CONDITION_SET BACS ON CTC.INSTITUTION_NUMBER = BACS.INSTITUTION_NUMBER " +
                                                                        "                                          AND CTC.CLIENT_TARIFF = BACS.INDEX_FIELD " +
                                                                        "                                          AND BACS.LANGUAGE = 'USA' " +
                                                                        "INNER JOIN BWT_SERVICES BS ON CTC.INSTITUTION_NUMBER = BS.INSTITUTION_NUMBER " +
                                                                        "                           AND CTC.SERVICE_ID = BS.INDEX_FIELD " +
                                                                        "                           AND BS.LANGUAGE = 'USA' " +
                                                                        "WHERE CTC.INSTITUTION_NUMBER = :institutionNumber " +
                                                                        "  AND CTC.CLIENT_NUMBER = '00000000' " +
                                                                        "  AND SERVICE_CONTRACT_ID = :serviceContractId " +
                                                                        "  AND BACS.INDEX_FIELD = :tariffIndex" +
                                                                        "  AND BS.INDEX_FIELD = :serviceIdIndex " +
                                                                        "ORDER BY 1,3,5 ) a";

    public static final String QUERY_VALIDATE_SERVICE_ID_NO_TARIFF = "SELECT DISTINCT BSCI.INDEX_FIELD SERVICE_CONTACT_ID,   " +
            "                            BSCI.SERVICE_CONTRACT SERVICE_CONTACT_ID_DESCRIPTION,   " +
            "                            BACS.INDEX_FIELD MERCHANT_TARIFF_INDEX,   " +
            "                            BACS.CONDITION_SET MERCHANT_TARIFF_DESCRIPTION,   " +
            "                            BS.INDEX_FIELD SERVICE_CODE,   " +
            "                            BS.SERVICE_ID SERVICE_DESCRIPTION   " +
            "            FROM CBR_TRANSACTION_CHARGES CTC   " +
            "            INNER JOIN BWT_SERVICE_CONTRACT_ID BSCI ON CTC.INSTITUTION_NUMBER = BSCI.INSTITUTION_NUMBER   " +
            "                                                    AND CTC.SERVICE_CONTRACT_ID = BSCI.INDEX_FIELD   " +
            "                                                    AND BSCI.LANGUAGE = 'USA'   " +
            "            INNER JOIN BWT_ACCOUNT_CONDITION_SET BACS ON CTC.INSTITUTION_NUMBER = BACS.INSTITUTION_NUMBER   " +
            "                                                      AND CTC.CLIENT_TARIFF = BACS.INDEX_FIELD   " +
            "                                                      AND BACS.LANGUAGE = 'USA'   " +
            "            INNER JOIN BWT_SERVICES BS ON CTC.INSTITUTION_NUMBER = BS.INSTITUTION_NUMBER   " +
            "                                       AND CTC.SERVICE_ID = BS.INDEX_FIELD   " +
            "                                       AND BS.LANGUAGE = 'USA'   " +
            "            WHERE CTC.INSTITUTION_NUMBER = :institutionNumber " +
            "              AND CTC.CLIENT_NUMBER = '00000000'   " +
            "              AND SERVICE_CONTRACT_ID = :serviceContractId " +
            "              AND BS.INDEX_FIELD = :serviceIdIndex ";

    public static final String QUERY_VALIDATE_IF_ACTIVE_SPECIFIC_CHARGES = "SELECT COUNT(*) " +
                                                                                "FROM CBR_TRANSACTION_CHARGES CTC " +
                                                                                "WHERE CTC.INSTITUTION_NUMBER = :institutionNumber " +
                                                                                "  AND CTC.CLIENT_NUMBER = :internalMerchantId " +
                                                                                "  AND CTC.EXPIRY_DATE >= ( SELECT POSTING_DATE " +
                                                                                "   FROM SYS_POSTING_DATE SPD " +
                                                                                "   WHERE SPD.INSTITUTION_NUMBER = CTC.INSTITUTION_NUMBER " +
                                                                                "     AND SPD.STATION_NUMBER = '129') ";

    public static final String QUERY_GET_MERCHANT_REFERENCES = "SELECT CCR.INSTITUTION_NUMBER, CCR.CLIENT_NUMBER, CCR.CLIENT_REFERENCE_TYPE CLIENT_REFERENCE_INDEX,"
    		+ "BCRT.CLIENT_REFERENCE_TYPE CLIENT_REFERENCE_DESCRIPTION,"
    		+ "CCR.CLIENT_REFERENCE_NUMBER CLIENT_REFERENCE_VALUE,"
    		+ "NVL (TO_CHAR (TO_DATE (SUBSTR (AUDIT_TRAIL, 0, 5), 'YYDDD'), 'YYYYMMDD'),'') LAST_UPDATED,"
    		+ "(SELECT SUI.USERNAME FROM SYS_USER_INFORMATION SUI WHERE USERID = SUBSTR (AUDIT_TRAIL, 14, 6) "
    		+ "UNION ALL "
    		+ "SELECT OUP.CONTACT_NAME FROM OMNI_USER_PROFILE OUP WHERE OUP.SEQUENCE_NO = SUBSTR (AUDIT_TRAIL, 14, 6)) LAST_UPDATED_BY "
    		+ "FROM CIS_CLIENT_REFERENCE CCR "
    		+ "INNER JOIN BWT_CLIENT_REFERENCE_TYPE BCRT "
    		+ "ON CCR.CLIENT_REFERENCE_TYPE = BCRT.INDEX_FIELD "
    		+ "AND CCR.INSTITUTION_NUMBER = BCRT.INSTITUTION_NUMBER "
    		+ "AND BCRT.LANGUAGE = 'USA' "
    		+ "WHERE CCR.INSTITUTION_NUMBER = :institutionNumber AND CCR.CLIENT_NUMBER = :clientNumber";

    public static final String QUERY_GET_REFERENCE_INDEX_ASSIGNED_TO_INST = "SELECT DISTINCT amov.val_value    " +
                                                                            " FROM OMNI_API.API_MERCH_ONBOARDING_VALS amov     " +
                                                                            "  LEFT OUTER JOIN OMNI_PROD.OCHT_CLIENT_REF_SUB_TYPE ocrst     " +
                                                                            "   ON amov.institution_number = ocrst.institution_number     " +
                                                                            "   AND amov.val_value = ocrst.client_reference_type     " +
                                                                            "  WHERE  amov.val_Description = 'VALIDATE_CLIENT_REFERENCE'     " +
                                                                            "     AND amov.institution_number = :institutionNumber ";

    
    public static final String QUERY_GET_MATCHING_REF_INDEX_TO_REF_VALUE = "SELECT ocrst.INDEX_FIELD, amov.VAL_VALUE  " +
                                                                            "    FROM OMNI_API.API_MERCH_ONBOARDING_VALS amov " +
                                                                            "         LEFT OUTER JOIN OMNI_PROD.OCHT_CLIENT_REF_SUB_TYPE ocrst " +
                                                                            "            ON     amov.institution_number = ocrst.institution_number " +
                                                                            "               AND amov.val_value = ocrst.client_reference_type " +
                                                                            "   WHERE  (amov.val_Description = 'VALIDATE_CLIENT_REFERENCE' " +
                                                                            "         AND amov.institution_number = :institutionNumber) OR " +
                                                                            "         (amov.val_Description = 'VALIDATE_CLIENT_REFERENCE'  " +
                                                                            "         AND amov.institution_number = :institutionNumber  " +
                                                                            "         AND ocrst.index_field IS NULL)";

    public static final String QUERY_REF_VALUE_IF_EMPTY = "SELECT ocrst.index_field " +
                                                            "  FROM OMNI_API.API_MERCH_ONBOARDING_VALS amov " +
                                                            "       LEFT OUTER JOIN OMNI_PROD.OCHT_CLIENT_REF_SUB_TYPE ocrst " +
                                                            "          ON     amov.institution_number = ocrst.institution_number " +
                                                            "             AND amov.val_value = ocrst.client_reference_type " +
                                                            " WHERE    amov.val_Description = 'VALIDATE_CLIENT_REFERENCE' " +
                                                            "           AND amov.institution_number = :institutionNumber " +
                                                            "           AND amov.val_value = :referenceIndex " +
                                                            "           AND ocrst.index_field IS NULL";


    public static final String QUERY_INSERT_MERCHANT_REFERENCE = "INSERT INTO CIS_CLIENT_REFERENCE " +
                                                                    " (INSTITUTION_NUMBER,RECORD_DATE, CLIENT_NUMBER, CLIENT_REFERENCE_TYPE, CLIENT_REFERENCE_NUMBER, AUDIT_TRAIL) " +
                                                                    " VALUES " +
                                                                    " (:institutionNumber,TO_CHAR(SYSDATE,'yyyyMMdd'), :internalMerchantId, :referenceIndex, CASE WHEN :referenceValue = ' ' THEN  NULL ELSE :referenceValue END, :auditTrail)";

    public static final String QUERY_UPDATE_MERCHANT_REFERENCE = "UPDATE CIS_CLIENT_REFERENCE " +
                                                                    " SET CLIENT_REFERENCE_NUMBER = CASE WHEN :referenceValue = ' ' THEN  NULL ELSE :referenceValue END " +
                                                                    " WHERE INSTITUTION_NUMBER = :institutionNumber " +
                                                                    "  AND CLIENT_NUMBER = :internalMerchantId " +
                                                                    "  AND CLIENT_REFERENCE_TYPE = :referenceIndex ";

    public static final String QUERY_DELETE_MERCHANT_REFERENCES =   "DELETE " +
                                                                    "FROM CIS_CLIENT_REFERENCE " +
                                                                    "WHERE INSTITUTION_NUMBER = :institutionNumber " +
                                                                    "  AND CLIENT_NUMBER = :internalMerchantId " +
                                                                    "  AND CLIENT_REFERENCE_TYPE = :referenceIndex ";
}
