package behavioral.mediator.implementation

interface IControl {
    open fun validate(): ValidationResult
}

enum class ValidationResult {
    VALID,
    INVALID
}
