import React from 'react';
import styled from 'styled-components';

const StyledAsideDiv = styled.div`
    width: 100%;
    height: 100%;
    background-image: url( ${ (props) => props.urlStr});
    background-repeat: no-repeat;
    background-position: center center;
    background-size: cover;
`;

const Aside = ( props ) => {

    const handleClick = () => {
        window.open("http://www.naver.com");
    }

    return (
        <StyledAsideDiv urlStr={props.x} onClick={ handleClick}>
        </StyledAsideDiv>
    );
};

export default Aside;