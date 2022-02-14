package tj.politech.diplom.comporison_test.repository

import tj.politech.diplom.comporison_test.entity.ComparisonTestEntity
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList

interface ComparisonTestRepository {
    fun getComparisonTests(
        subjectId: Int,
        testCount: Int
    ): GenericResponseArrayList<ComparisonTestEntity>
}