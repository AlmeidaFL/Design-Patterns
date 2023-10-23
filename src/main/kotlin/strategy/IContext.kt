package strategy

interface IContext{

}

interface LegalEntity: IContext {
    var name: String
    var heritage: Double
    var numberOfCoworkers: Int
}

interface NaturalPerson: IContext {
    var numberOfDepedents: Int
    var heritage: Double
}
