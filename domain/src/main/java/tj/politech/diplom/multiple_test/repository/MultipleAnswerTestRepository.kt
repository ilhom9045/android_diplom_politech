package tj.politech.diplom.multiple_test.repository

import tj.politech.diplom.multiple_test.entiry.MultipleAnswerEntity
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList

interface MultipleAnswerTestRepository {
    fun getMultipleAnswerTest(
        subjectId: Int,
        testCount: Int
    ): GenericResponseArrayList<MultipleAnswerEntity>
}