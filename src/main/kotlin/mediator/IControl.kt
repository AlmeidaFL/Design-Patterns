package mediator

interface IControl {
    open fun validate(): ValidationResult
}

enum class ValidationResult {
    VALID,
    INVALID
}
