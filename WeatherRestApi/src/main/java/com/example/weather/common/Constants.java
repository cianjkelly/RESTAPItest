package com.fiserv.merchantmaintenance.common;

public class Constants {
    private Constants() {
    }

    public static final String HEADER_CONTENT_TYPE_JSON = "application/json";

	public static final String FSV_ID_INSTITUTION_NUMBER_CONTENT_TYPE = "FSV-Interaction-Id: %s, Institution-Number: %s,  Content-Type: %s";
	public static final String INSTITUTION_NUMBER_S_EXCEPTION_S = "Institution-Number: %s, Exception: %s";
	public static final String HEADER_VALIDATION = "Header Validation";
	public static final String ERROR_CODE_INVALID_REQUEST = "INVALID_REQUEST";
	public static final String ERROR_CODE_INPUT_VALIDATION_ERROR = "INPUT_VALIDATION_ERROR";
	public static final String ERROR_TITLE_INPUT_VALIDATION = "Provided input not as expected.";
	public static final String ERROR_CODE_AUTHORIZATION_ERROR = "AUTHORIZATION_ERROR";
	public static final String ERROR_TITLE_AUTHORIZATION_ERROR = "An error has occurred during JWT Validation. Please contact support.";
	public static final String ERROR_TITLE_HEADER_INST_NUMBER_NOT_NUMBERIC = "Request not as per specification. Institution-Number must be 8 digits long.";
	public static final String ERROR_TITLE_HEADER_INST_NUMBER_INVALID = "Request not as per specification. Institution-Number provided in header is invalid.";
	public static final String ERROR_TITLE_INVALID_FSV_ID = "Request not as per specification. FSV-Interaction-Id provided in header is invalid.";
	public static final String ERROR_TITLE_INVALID_INTERNAL_MERCHANT_ID_JWT = "Request not as per specification. Provided Internal-Merchant-Id is either missing or invalid.";
	public static final String ERROR_TITLE_MISSING_MANDATORY_HEADER = "Request not as per specification. Mandatory header FSV-Interaction-Id or Institution-Number or Content-Type is missing.";
	public static final String ERROR_CODE_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String ERROR_TITLE_INTERNAL_SERVER_ERROR = "A problem occurred while processing the request. Please contact support.";
    public static final String ERROR_TITLE = "A problem occurred while processing the request. Please contact support.";
    public static final String ERROR_TITLE_HEADER_JWT_NOT_FOUND = "Request not as per specification. JWT token not found or is malformed.";
    public static final String ERROR_CODE_INVALID_INSTITUTION = "INVALID_INSTITUTION_NUMBER";
	public static final String ERROR_TITLE_INVALID_INSTITUTION = "Provided institution number is not valid.";
	public static final String ERROR_CODE_INVALID_INTERNAL_MERCHANT_ID = "INVALID_INTERNAL_MERCHANT_ID";
	public static final String ERROR_TITLE_INVALID_INTERNAL_MERCHANT_ID = "Provided internal merchant id is not valid.";
	public static final String CONST_EFFECTIVE_DATE_EXPIRY_DATE = "effectiveDate, expiryDate";
	public static final String ERROR_TITLE_INVALID_EXPIRY_DATE = "Expiry Date cannot be prior the Effective Date.";
	public static final String ERROR_CODE_INVALID_EXPIRY_DATE = "INVALID_EXPIRY_DATE";
	public static final String CONST_CATEGORY_EFFECTIVE_DATE = "category, effectiveDate";
	public static final String ERROR_TITLE_INVALID_ADDRESS = "Provided future address is not valid. An address is identified by effective date and category.";
	public static final String ERROR_CODE_INVALID_ADDRESS = "INVALID_ADDRESS";
	public static final String CONST_CHARGE_ID = "chargeId";
	public static final String CONST_RECORD_ID_NUMBER = "recordIdNumber";
	public static final String ERROR_TITLE_INVALID_INDIVIDUAL_CHARGES = "Provided individual charges are not valid. Provided merchant has no individual charges to suppress.";
	public static final String ERROR_CODE_INVALID_INDIVIDUAL_CHARGES = "INVALID_INDIVIDUAL_CHARGES";
	public static final String CONST_INSTITUTION_NUMBER_CLIENT_NUMBER = "institutionNumber, clientNumber";
	public static final String ERROR_TITLE_DUPLICATES_FOUND = "There are duplicates in the provided payload.";
	public static final String ERROR_CODE_DUPLICATES_FOUND = "DUPLICATES_FOUND";
    public static final String INVALID_COUNTRY = "INVALID_COUNTRY";
    public static final String COUNTRY_CODE_NOT_ASSIGNED = "Provided countryCode is not valid. Country Code not assigned to the merchant";
    public static final String HEADER_ENVIRONMENT = "Environment";
    public static final String CATEGORY_NOT_ASSIGNED = "CATEGORY_NOT_ASSIGNED";
    public static final String ADDRESS_ASSIGNED_MERCHANT = "Address Category not assigned to the merchant";
    public static final String INVALID_DELIVERY_METHOD_INDEX = "INVALID_DELIVERY_METHOD_INDEX";
    public static final String DELIVERY_METHOD_NOT_ASSIGNED = "Procided deliveryMethod is not valid. Delivery Method not assigned to the merchant.";
    public static final String HEADER_FSV_INTERACTION_ID = "FSV-Interaction-Id";
    public static final String HEADER_INSTITUTION_NUMBER = "Institution-Number";
    public static final String HEADER_INTERNAL_MERCHANT_ID = "Internal-Merchant-Id";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String INTERNAL_SERVER_ERROR_TITLE = "Internal server error found while processing the request. Please contact support.";
    public static final String ERROR_MESSAGE = "A problem occurred while processing the request. Please contact support.";
    public static final String TRANSACTION_IDENTIFIER = "transactionIdentifier";
    public static final String INSTITUTION_NUMBER_S_INTERNAL_MERCHANT_ID_S_EXCEPTION_S = "Institution-Number: %s, Internal-Merchant-Id: %s, Exception: %s";
    public static final String INSTITUTION_NUMBER_PARAM = "institutionNumber";
    public static final String SERVICE_CONTRACT_ID_PARAM = "serviceContractId";
    public static final String CLIENT_NUMBER_PARAM = "clientNumber";
    public static final String STATEMENT_GEN_PARAM = "statementGeneration";
    public static final String STATEMENT_TYPE_PARAM = "statementType";
    public static final String ACCOUNT_STATUS_PARAM = "accountStatus";
    public static final String INTERNAL_ACCOUNT_NUMBER_PARAM = "internalAccountNumber";
    public static final String FIRST_DEBIT_DATE_FIELD_PARAM = "firstDebitDateField";
    public static final String PARENT_INTERNAL_MERC_ID_PARAM = "parentInternalMerchantId";
    public static final String APPLICATION_NUMBER_PARAM = "applicationNumber";
    public static final String STATMENT_GEN_CODE_PARAM = "statementGenerationCode";
    public static final String STATMENT_TYPE_INDEX_PARAM = "statementTypeIndex";
    public static final String AUDIT_TRAIL_PARAM = "auditTrail";
    public static final String CLIENTS = "clients";
    public static final String INSTITUTIONS = "institutions";

    public static final String ERROR_TITLE_INVALID_SERVICE_ID = "Provided serviceIdIndex is not valid. Service ID not assigned to the merchant.";
	public static final String ERROR_TITLE_NOT_MEMBER_MERCHANT = "Not a Member level Merchant.";
	
    public static final String MERCH_ID = "internalMerchantId";
    public static final String MALFORMED = "Expected JWT token not found or is malformed.";
    public static final String MISSING_OR_INVALID = "MISSING_OR_INVALID_JWT_TOKEN";
    public static final String INTERNAL_MERCHANT_ID = "internalMerchantId";
    public static final int MAX_DATA = 128;
    public static final int EXPECTED_BUFFER_DATA = 1024;
    public static final String SERVICE_CONTRACT = "serviceContract: %s";
    public static final String ENVIRONMENT = "environment: %s";
    public static final String CLIENT_TARRIF = "clientTarrif: %s";
    public static final String MERCHANT_TARRIF = "merchantTariff: %s";
    public static final String MERCHANT_TARRIF_INDEX = "merchantTarrifIndex: %s";
    public static final String SERVICE_ID_INDEX = "serviceIdIndex: %s";
    public static final String SETTLEMENT_METHOD_INDEX = "settlementMethodIndex: %s";
    public static final String POSTING_TARIFF_INDEX = "postingTariffIndex: %s";
    public static final String LIMIT = "limit: %d";
    public static final String OFFSET = "offset: %d";
    public static final String COUNT = "count: %d";
    public static final String REC_ID = "recordIdNumber";
    public static final String NUM_OF_REC = "Number of records: %d";
    public static final String BLANK = "";
    public static final String FSV = "FSV-Interaction-Id";
    public static final String CLASSIFICATION = "classification: %s";
    public static final String INST_NUMBER = "institutionNumber: %s";
    public static final String INSTITUTION_NUMBER = "institutionNumber";
    public static final String CLASSIFICATION_CODE = "classification,code";
    public static final String CLIENT_TARIFF_NOT_FOUND = "CLIENT_TARIFF_NOT_FOUND";
    public static final String SETTLEMENT_METHOD_NOT_FOUND = "SETTLEMENT_METHOD_NOT_FOUND";
    public static final String ERROR_CODE_INVALID_SERVICE_ID = "INVALID_SERVICE_ID";
    public static final String ERROR_CODE_NOT_MEMBER_MERCHANT = "NOT_A_MEMBER_MERCHANT";
    public static final String POSTING_TARIFF_INDEX_NOT_FOUND = "POSTING_TARIFF_INDEX_NOT_FOUND";
    public static final String MERCHANT_TARIFF_NOT_FOUND = "MERCHANT_TARIFF_NOT_FOUND";
    public static final String SERVICE_CONTRACT_NOT_FOUND = "SERVICE_CONTRACT_NOT_FOUND";
    public static final String INSTITUTION_NOT_FOUND = "INSTITUTION_NOT_FOUND";
    public static final String INTERNAL_MERCHANT_ID_NOT_FOUND = "INTERNAL_MERCHANT_ID_NOT_FOUND";
    public static final String INVALID_ADDRESS_CATEGORY = "INVALID_ADDRESS_CATEGORY";
    public static final String DELIVERY_METHOD_NOT_FOUND = "DELIVERY_METHOD_NOT_FOUND";
    public static final String POSTING_DATE = "CANNOT_CHANGE_ACTIVE_ADDRESSES";
    public static final String ADDRESS_ALREADY_EXISTS = "ADDRESS_ALREADY_EXISTS";
    public static final String COUNTRY_CODE_NOT_FOUND = "COUNTRY_CODE_NOT_FOUND";
    public static final String DUPLICATES_EXIST_IN_BODY = "DUPLICATES_EXIST_IN_BODY";
    public static final String GENERIC_MASK = "99998";
    public static final String GENERIC_MASK_2 = "99999";
    public static final String OK = "OK";
    public static final String RC = "RC:";
    public static final String EXCEPTION = "Exception: %s";
    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT_POSTING_TARIFF_INDEX_SETTLEMENT_METHOD_INDEX_OFFSET_LIMIT = "institutionNumber: %s, serviceContract: %s, postingTariffIndex: %s, settlementMethodIndex: %s, offset: %d, limit:%d";

    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT_POSTING_TARIFF_INDEX_SETTLEMENT_METHOD_INDEX = "institutionNumber: %s, serviceContract: %s, postingTariffIndex: %s, settlementMethodIndex: %s";

    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT_MERCHANT_TARIFF_SERVICE_ID_INDEX_OFFSET_LIMIT = "institutionNumber: %s, serviceContract: %s, merchantTariff: %s, serviceIdIndex: %s, offset: %d, limit:%d";

    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT_MERCHANT_TARIFF_SERVICE_ID_INDEX = "institutionNumber: %s, serviceContract: %s, merchantTariff: %s, serviceIdIndex: %s";

    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT_MERCHANT_TARIFF_INDEX_SERVICE_ID_INDEX = "institutionNumber: %s,serviceContract: %s,merchantTariffIndex:%s,serviceIdIndex: %s";

    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT_CLIENT_TARIFF_OFFSET_LIMIT = "institutionNumber: %s, serviceContract: %s, clientTariff: %s, offset: %d, limit: %d";

    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT_CLIENT_TARIFF = "institutionNumber: %s, serviceContract: %s, clientTariff: %s";

    public static final String INSTITUTION_NUMBER_SERVICE_CONTRACT = "institutionNumber: %s, serviceContract: %s";
    
    public static final String INSTITUTION_NUMBER_INTERNAL_MERCHANT_ID = "institutionNumber: %s, internalMerchantId: %s";
    
    public static final String ENVIRONMENT_MERCHANT_ID = "environment: %s, internalMerchantId: %s";
    
    public static final String ENVIRONMENT_MER_ID_ADD_CAT_ADD_STATUS = "environment: %s, internalMerchantId: %s, addressCategory: %s, addressStatus: %s";
    public static final String ENVIRONMENT_MER_ID_ADDRESS = "environment: %s, internalMerchantId: %s, merchantAddress: %s";
    public static final String UNACCEPTABLE_EFFECTIVE_DATE_ERROR_MSG = "Cannot update fee with historic effective date. Please use POST API request to override account fee.";

    public static final String INVALID_EFFECTIVE_DATE = "INVALID_EFFECTIVE_DATE";

    public static final String PROVIDED_FEES_CONTAINS_DUPLICATES = "Provided fees contains duplicates.";
    
    public static final String DUAL_COLUMN_ENABLED = "DUAL_COLUMN_ENABLED";
    public static final String SECURE_DATA_ENABLED = "SECURE_DATA_ENABLED";

    public static final String DUPLICATE_FEE_FOUND = "DUPLICATE_FEE_FOUND";
    public static final String VALIDATE_COUNTRY = "VALIDATE_COUNTRY";
    
    public static final String NOTVALID = " is not valid.";
    public static final String PAYDR = "Payment Format DR ";
    public static final String MANDATORY_FIELDS_MISSING_FIELDS = "bankName, accountName, CounterBankNumber, accountNumber";
    public static final String MANDATORY_FIELDS_MISSING_MSG = "When updating a billing level account, the below fields are mandatory.";
    public static final String MANDATORY_FIELDS_MISSING = "MANDATORY_FIELDS_MISSING";    
    public static final String CONST_ALL = "ALL";
	public static final String CONST_999 = "999";
	public static final String CONST_001 = "001";
    public static final String INST = "institutions";

}
