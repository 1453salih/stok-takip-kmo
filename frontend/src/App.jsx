import React from 'react';
import {Card, Col, Row} from 'antd';
import 'antd/dist/reset.css'; // Ant Design reset CSS

function App() {
    return (
        <Row gutter={[16, 8]}>
            <Col span={8} >
                <Card title="Alım" >
                </Card>
            </Col>
            <Col span={8} />
            <Col span={8} />

            <Col span={8} />
            <Col span={8} />
            <Col span={8} />
        </Row>

    );
}

export default App;