package tj.politech.diplom.repository.multiple_answer_test

import tj.politech.diplom.multiple_test.entiry.MultipleAnswerEntity
import tj.politech.diplom.multiple_test.repository.MultipleAnswerTestRepository
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList

class MultipleAnswerTestRepositoryImpl(private val multipleAnswerTestApi: MultipleAnswerTestApi) :
    MultipleAnswerTestRepository {
    override fun getMultipleAnswerTest(
        subjectId: Int,
        testCount: Int
    ): GenericResponseArrayList<MultipleAnswerEntity> {
        return multipleAnswerTestApi.getMultipleAnswerTest(
            subjectId = subjectId,
            testCount = testCount
        )
    }
}