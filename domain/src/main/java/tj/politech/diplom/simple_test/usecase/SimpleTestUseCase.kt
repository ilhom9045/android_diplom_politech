package tj.politech.diplom.simple_test.usecase

import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.simple_test.entity.SimpleTestEntity
import tj.politech.diplom.simple_test.repository.SimpleTestRepository

class SimpleTestUseCase(private val simpleTestRepository: SimpleTestRepository) {
    fun execute(subjectId: Int, count: Int): GenericResponseArrayList<SimpleTestEntity> {
        return simpleTestRepository.getSimpleTest(subjectId = subjectId, count = count)
    }
}