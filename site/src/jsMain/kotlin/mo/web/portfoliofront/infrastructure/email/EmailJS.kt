package mo.web.portfoliofront.infrastructure.email

import mo.web.portfoliofront.utility.Constants.EMAIL_JS_SERVICE_ID

private external val emailjs: dynamic

fun initEmailJS(publicKey: String) {
    val options = js("({})")
    options.publicKey = publicKey
    emailjs.init(options)
}

fun sendContactEmail(
    serviceId: String,
    templateId: String,
    name: String,
    email: String,
    message: String,
    onSuccess: () -> Unit,
    onError: (String) -> Unit,
) {
    val params = js("({})")
    params.name = name
    params.email = email
    params.message = message

    val promise: dynamic = emailjs.send(serviceId, templateId, params)
    promise.then(
        { _: dynamic -> onSuccess() },
        { error: dynamic -> onError(error?.text?.toString() ?: "Failed to send message.") }
    )
}
