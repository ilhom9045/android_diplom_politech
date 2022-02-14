package tj.politech.diplom.multiple_test.usecase

import tj.politech.diplom.multiple_test.entiry.MultipleAnswerEntity
import tj.politech.diplom.multiple_test.repository.MultipleAnswerTestRepository
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList

class MultipleAnswerTestUseCase(private val multipleAnswerTestRepository: MultipleAnswerTestRepository) {
    fun execute(subjectId: Int, testCount: Int): GenericResponseArrayList<MultipleAnswerEntity> {
        return multipleAnswerTestRepository.getMultipleAnswerTest(
            subjectId = subjectId,
            testCount = testCount
        )
    }
}