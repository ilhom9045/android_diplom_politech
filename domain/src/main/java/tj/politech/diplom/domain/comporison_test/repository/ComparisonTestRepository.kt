package tj.politech.diplom.domain.comporison_test.repository

import tj.politech.diplom.domain.comporison_test.entity.ComparisonTestEntity
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList

interface ComparisonTestRepository {
    fun getComparisonTests(
        subjectId: Int,
        testCount: Int
    ): GenericResponseArrayList<ComparisonTestEntity>
}