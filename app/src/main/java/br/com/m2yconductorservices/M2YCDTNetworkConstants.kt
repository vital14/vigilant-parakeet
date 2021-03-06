package br.com.m2yconductorservices

import br.com.m2yconductorservices.data.M2YCDTEnvironment

object M2YCDTNetworkConstants {
    //1xx Informational
    const val CODE_WITHOUT_NETWORK = 0

    //2xx Success
    const val CODE_RESPONSE_SUCCESS = 200

    //3xx Redirection
    const val CODE_NOT_FOUND = 340

    //4xx Client Error
    const val CODE_TIMEOUT = 408
    const val CODE_RESPONSE_UNAUTHORIZED = 401
    const val CODE_BAD_REQUEST = 400
    const val CODE_FORBIDDEN = 403
    val CODE_ITEM_NOT_FOUND = 404

    //5xx Server Error
    const val CODE_UNKNOWN = 500

    //API URLs
    val BASE_URL = M2YCDTEnvironment.baseUrl
    const val LOGIN_URL = "login/"
    const val ACCOUNT_URL = "account/"
    const val PERSON_URL = "person/"
    const val TRANSFER_URL = "transfer/"
    const val REGISTRATION_URL = "registration/"
    const val RECHARGE_URL = "recharge/"
    const val TRANSFER_P2P_URL = "p2p/"
    const val BANKS_URL = "banks/"
    const val BANKS_TRANSPORTS = "transportcard/"
    const val CARD_URL = "card/"
    const val INVOICES = "invoices/"
    const val PAYMENT = "payment/"


    const val CDT_BASE_URL = "cdt/"
    const val CDT_RATE_URL = "${CDT_BASE_URL}rate/"
    const val CDT_PAYMENTS_URL = "${CDT_BASE_URL}payment/"
    const val CDT_BANK_TRANSFERS = "${CDT_BASE_URL}transfer/"
    const val CDT_TRANSFER_P2P = "${CDT_BASE_URL}transfer/"
    const val CDT_RECHARGES = "${CDT_BASE_URL}recharge/"
    const val CDT_ACCOUNT_URL = "${CDT_BASE_URL}account/"
    const val CDT_ADDRESS_URL = "${CDT_BASE_URL}address/"
    const val CDT_CARD_URL = "${CDT_BASE_URL}card/"
    const val CDT_PERSON_URL = "${CDT_BASE_URL}person/"
    const val CDT_RECHARGE_URL = "${CDT_BASE_URL}recharge/"
    const val CDT_TRANSFER_URL = "${CDT_BASE_URL}transfer/"
    const val CDT_PAYMENT_URL = "${CDT_BASE_URL}payment/"
    const val CDT_BILLET_URL = "${CDT_BASE_URL}billet/"
    const val CDT_BANK_SLIP_URL = "${CDT_BASE_URL}bank_slip/"

    const val CDT_AUTH_URL = ""

    // KEYS
    const val ENCRYPTION_KEY = "e2kS14JoJCPJMlxJwg3swSOMGICbLSX7"
    const val ENCRYPTION_IV = "02OUlFZgdq6QkFr2"
}