package com.orange

import software.amazon.awscdk.Duration
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscription
import software.amazon.awscdk.services.sqs.Queue
import software.constructs.Construct

class CdkKotlinGradleStack @JvmOverloads constructor(parent: Construct?, id: String?, props: StackProps? = null) :
    Stack(parent, id, props) {
    init {
        val queue = Queue.Builder.create(this, "CdkKotlinGradleStackQue")
            .visibilityTimeout(Duration.seconds(300))
            .build()

        val topic = Topic.Builder.create(this, "CdkKotlinGradleStackTopic")
            .displayName("My First Topic Yeah")
            .build()

        topic.addSubscription(SqsSubscription(queue))
    }
}
