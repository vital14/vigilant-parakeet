package br.com.m2yconductorservices.data.remote.models.response

data class BarcodeValidationResponse(
    var Barcode: String?,
    var Result: DataReturnResultResponse?
) {
    fun getCharges() = (Result?.PaymentInfoNPC?.ComputedBillValues?.DiscountValueCalculated
        ?: 0f) + (Result?.PaymentInfoNPC?.ComputedBillValues?.CalculatedInterestAmount
        ?: 0f) + (Result?.PaymentInfoNPC?.ComputedBillValues?.CalculatedFineValue ?: 0f)
}

data class DataReturnResultResponse(
    val Success: Boolean?,
    val BillPaymentTypeId: Int?,
    val BillPaymentTypeDescription: String?,
    val HasEnoughBalance: Boolean?,
    val WasPaid: Boolean?,
    val PaymentSchedulingDate: String?,
    val ReachedLimit: Boolean?,
    val ValidateBarCode: ValidateBarCodeResponse?,
    val PaymentInfoNPC: PaymentInfoNPCResponse?
)

data class PaymentInfoNPCResponse(
    val Id: Int?,
    val ContractNumber: String?,
    val IdentificationNumber: String?,
    val DueDate: String?,
    val BillValue: Float?,
    val TaxBreakValue: Int?,
    val PaymentLimitDate: String?,
    val OpeningPaymentschedule: String?,
    val ClosingPaymentschedule: String?,
    val IsValidDate: Boolean?,
    val IsBeforeWindow: Boolean?,
    val IsValidWindow: Boolean?,
    val NextUtilDay: String?,
    val BarCodeNumber: String?,
    val Traders: TradersResponse?,
    val ReceivingDivergentValue: ReceivingDivergentValueResponse?,
    val ReceiptRules: ReceiptRulesResponse?,
    val ComputedBillValues: ComputedBillValuesResponse?,
    val BillStatus: BillStatusResponse?,
    val Params: ParamsResponse?
)

data class ReceivingDivergentValueResponse(
    val Code: Int?,
    val Description: String?
)

data class TradersResponse(
    val Recipient: String?,
    val RecipientDocument: String?,
    val PayerName: String?,
    val PayerDocument: String?
)

data class ReceiptRulesResponse(
    val TypeOfPaymentMin: String?,
    val TypeOfPaymentMax: String?,
    val MinPaymentValue: Float?,
    val MaxPaymentValue: Float?
)

data class ComputedBillValuesResponse(
    val CalculatedInterestAmount: Float?,
    val CalculatedFineValue: Float?,
    val DiscountValueCalculated: Float?,
    val TotalAmountToCharge: Float?,
    val PaymentAmountUpdated: Float?,
    val ComputedDate: String?
)

data class BillStatusResponse(
    val Code: Int?,
    val Description: String?
)

data class ParamsResponse(
    val OutOfDate: Boolean?,
    val AptoForPayment: Boolean?,
    val BlockPaymentOfDate: Boolean?
)

data class ValidateBarCodeResponse(
    val Id: Int?,
    val Description: String?,
    val Value: Float?,
    val DueDate: String?, //yyyy-mm-dd
    val IsOutTime: Boolean?,
    val TimeWindow: Int?,
    val MinTime: String?,
    val MaxTime: String?,
    val IsDefaultTime: Boolean?,
    val PaymentType: Int?,
    val HasDueDate: Boolean?,
    val BarCodeNumber: String?,
    val CurrentDate: String? //yyyy-mm-dd
)