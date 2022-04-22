package tj.politech.diplom.data_repository.comporison_test

import tj.politech.diplom.domain.comporison_test.entity.ComparisonTestEntity
import tj.politech.diplom.domain.comporison_test.repository.ComparisonTestRepository
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList

class ComparisonTestRepositoryImpl(private val comparisonTestApi: ComparisonTestApi) :
    ComparisonTestRepository {
    override fun getComparisonTests(
        subjectId: Int,
        testCount: Int
    ): GenericResponseArrayList<ComparisonTestEntity> {
        return comparisonTestApi.getComparisonTest(subjectId = subjectId, testCount = testCount)
    }
}