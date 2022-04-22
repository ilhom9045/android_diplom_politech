package tj.politech.diplom.domain.multiple_test.repository

import tj.politech.diplom.domain.multiple_test.entiry.MultipleAnswerEntity
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList

interface MultipleAnswerTestRepository {
    fun getMultipleAnswerTest(
        subjectId: Int,
        testCount: Int
    ): GenericResponseArrayList<MultipleAnswerEntity>
}